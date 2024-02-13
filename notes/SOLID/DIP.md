### Dependency Inversion Principle
The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions. If the OCP states the goal of OO architecture, the DIP states the primary mechanism for achieving that goal.

The general idea of this principle is as simple as it is important: High-level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, which provide utility features. To achieve that, you need to introduce an abstraction that decouples the high-level and low-level modules from each other. Dependency inversion principle consists of two parts:

High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details. Details should depend on abstractions.

Our bird class looks pretty neat now. We have separated the behaviour into different lean interfaces which are implemented by the classes that need them. When we add new sub-classes we identify an issue. For birds that have the same behaviour, we have to implement the same behaviour multiple times.
```java
public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle is gliding");
    }
}

public class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is gliding");
    }
}
```
The above can be solved by adding a default method to the Flyable interface. This way, we can avoid code duplication. But which method should be the default implementation? What if in future we add more birds that have the same behaviour? We will have to change the default implementation or either duplicate the code.

Instead of default implementations, let us abstract the common behaviours to a separate helper classes. We will create a GlidingBehaviour class and a FlappingBehaviour class. The Eagle and Sparrow classes will implement the Flyable interface and use the GlidingBehaviour class. The Parrot class will implement the Flyable interface and use the FlappingBehaviour class.
```java
public class Eagle implements Flyable {
    private GlidingBehaviour glidingBehaviour;

    public Eagle() {
        this.glidingBehaviour = new GlidingBehaviour();
    }

    @Override
    public void fly() {
        glidingBehaviour.fly();
    }
}
```
Now we have a problem. The `Eagle` class is tightly coupled to the `GlidingBehaviour` class. If we want to change the behaviour of the `Eagle` class, we will have to open the Eagle class to change the behaviour. This is a violation of the dependency inversion principle. We should not depend on concrete classes. We should depend on abstractions.

Naturally, we rely on interfaces as the abstraction. We create a new interface `FlyingBehaviour` and implement it in the `GlidingBehaviour` and `FlappingBehaviour` classes. The `Eagle` class will now depend on the `FlyingBehaviour` interface.


```java
    interface FlyingBehaviour{
        void fly()
    }
    class GlidingBehaviour implements FlyingBehaviour{
        @Override
        public void fly() {
            System.out.println("Eagle is gliding");
        }
    }
    ...
 class Eagle implements Flyable {
        private FlyingBehaviour flyingBehaviour;

        public Eagle() {
            this.flyingBehaviour = new GlidingBehaviour();
        }

        @Override
        public void fly() {
            flyingBehaviour.fly();
        }
    }
```

**Without DIP**
```java
class Database {
  public void store(String data) {
    // Use specific JDBC code to write to MySQL database
  }
}

class EmployeeService {
  private Database database = new Database();

  public void saveEmployee(Employee employee) {
    String data = employee.toString();
    database.store(data);
  }
}

```
This example shows tight coupling between EmployeeService and Database. Any change in database technology would affect both classes.
**With DIP**
```java
interface DataWriter {
  void write(String data);
}

class MySQLEngine implements DataWriter {
  @Override
  public void write(String data) {
    // Use JDBC code to write to MySQL
  }
}

class PostgreSQLEngine implements DataWriter {
  @Override
  public void write(String data) {
    // Use specific code to write to PostgreSQL
  }
}

class EmployeeService {
  private DataWriter dataWriter;

  public EmployeeService(DataWriter dataWriter) {
    this.dataWriter = dataWriter;
  }

  public void saveEmployee(Employee employee) {
    String data = employee.toString();
    dataWriter.write(data);
  }
}

```
Here, `DataWriter` defines the abstraction, separating the storage mechanism from the service logic. `EmployeeService` 
injects the desired `DataWriter` implementation (e.g., `MySQLEngine` or `PostgreSQLEngine`) at runtime. This enables:

- Flexibility: Easily switch databases without modifying EmployeeService.
- Testability: Mock different DataWriter implementations for unit tests.
- Maintainability: Code becomes more modular and adaptable.
