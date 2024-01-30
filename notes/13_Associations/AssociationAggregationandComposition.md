### Association
is a general relationship between classes.
```java
class Car {
    // ...
}

class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }
}

```
### Aggregation
is a "whole" and "part" relationship, where the "part" can exist independently.
```java
class Department {
    // ...
}

class University {
    private List<Department> departments;

    public University(List<Department> departments) {
        this.departments = departments;
    }
}

```
### Composition
is a stronger form of aggregation, where the "part" is dependent on the "whole," and if the "whole" is
destroyed, the "part" is also destroyed.
```java
class Engine {
    // ...
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }
}

```