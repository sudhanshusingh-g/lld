### Single Responsibility Principle (SRP):
>A class should have only one reason to change.
Each class should have a single responsibility, encapsulating one aspect of the functionality.


Suppose we have a class called Employee that handles both employee data management and sending emails. This violates SRP because it has two reasons to change: if the employee data management logic changes or if the email sending logic changes.
```java
// Employee.java
public class Employee {
    public void manageData() {
        // Code for managing employee data
    }

    public void sendEmail() {
        // Code for sending email to employee
    }
}

```

We can split the Employee class into two separate classes: EmployeeData for managing employee data and EmailSender for sending emails. Each class now has a single responsibility, adhering to SRP.
```java
// EmployeeData.java
public class EmployeeData {
    public void manageData() {
        // Code for managing employee data
    }
}

// EmailSender.java
public class EmailSender {
    public void sendEmail() {
        // Code for sending email to employee
    }
}

```


### Open-Closed Principle
>Classes should be open for extension but closed for modification.
Software entities should be designed in a way that allows new functionality to be added without changing existing code.

Suppose we have a class Shape with a method calculateArea(). If we want to add a new shape, such as a Triangle, we might need to modify the calculateArea() method, violating OCP.
```java
// Shape.java
public class Shape {
    public double calculateArea() {
        // Common logic for calculating area of shapes
    }
}

// Triangle.java
public class Triangle extends Shape {
    public double calculateArea() {
        // Calculation logic for area of triangle
    }
}

```

We can create an abstract Shape class with a method calculateArea() and concrete subclasses like Circle, Rectangle, and Triangle. When we need to add a new shape, we simply create a new subclass without modifying existing code, adhering to OCP.
```java
public abstract class Shape {
    public abstract double calculateArea();
}

public class Circle extends Shape {
    @Override
    public double calculateArea() {
        // calculate area for circle
    }
}

public class Rectangle extends Shape {
    @Override
    public double calculateArea() {
        // calculate area for rectangle
    }
}

public class Triangle extends Shape {
    @Override
    public double calculateArea() {
        // calculate area for triangle
    }
}

```


### Liskov Substitution Principle (LSP)

>Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
Subtypes must be substitutable for their base types without altering the behavior of the program.


If we have a class Square that inherits from Rectangle, where Square restricts width and height to be equal, this violates LSP because substituting a Square for a Rectangle could lead to unexpected behavior.
```java
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Violates LSP
    }

    @Override
    public void setHeight(int height) {
        this.width = height; // Violates LSP
        this.height = height;
    }
}

```

We can design the classes Rectangle and Square in a way that honors LSP, such as by having separate behavior for setting width and height in each class. This ensures that substituting a Square for a Rectangle does not alter the behavior of the program.
```java
public class Shape {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Rectangle extends Shape {
    // No need to override setWidth and setHeight
}

public class Square extends Shape {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

```

### Interface Segregation Principle (ISP)

>Clients should not be forced to depend on methods they do not use.
Keep interfaces focused and granular, tailored to the needs of individual clients.


If we have a large interface Worker with methods for both work() and eat(), but some classes only need work(), this violates ISP because clients are forced to depend on methods they don't use.
```java
public interface Worker {
    void work();
    void eat();
}

public class Programmer implements Worker {
    @Override
    public void work() {
        // programmer-specific work
    }

    @Override
    public void eat() {
        // programmer-specific eating
    }
}

public class Manager implements Worker {
    @Override
    public void work() {
        // manager-specific work
    }

    @Override
    public void eat() {
        // manager-specific eating
    }
}

```

We can split the Worker interface into smaller, more focused interfaces like Workable and Eatable.
Classes that need both behaviors can implement both interfaces, while classes that only need one behavior can implement the relevant interface, adhering to ISP.
```java
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public class Programmer implements Workable, Eatable {
    @Override
    public void work() {
        // programmer-specific work
    }

    @Override
    public void eat() {
        // programmer-specific eating
    }
}

public class Manager implements Workable {
    @Override
    public void work() {
        // manager-specific work
    }
}

```
### Dependency Inversion Principle (DIP)
>High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details. Details should depend on abstractions.


If a high-level module ReportGenerator directly depends on a low-level module Database, changes in the Database implementation could require modifications in ReportGenerator, violating DIP.
```java
public class ReportGenerator {
    private Database database;

    public ReportGenerator() {
        this.database = new Database(); // Direct dependency on Database
    }

    public void generateReport() {
        // logic using Database
    }
}

public class Database {
    // Database implementation details
}

```

We can introduce an abstraction, such as an interface DataRepository, which both ReportGenerator and Database depend on. ReportGenerator interacts with DataRepository through this abstraction, allowing different implementations of DataRepository without modifying ReportGenerator, adhering to DIP.
```java
public interface DataRepository {
    // Methods for interacting with data
}

public class ReportGenerator {
    private DataRepository dataRepository;

    public ReportGenerator(DataRepository dataRepository) {
        this.dataRepository = dataRepository; // Dependency injection
    }

    public void generateReport() {
        // logic using DataRepository
    }
}

public class Database implements DataRepository {
    // Database implementation details
}

```