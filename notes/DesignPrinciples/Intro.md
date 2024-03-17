What is a good software? A good software must be :
- Maintainable
- Extensible

So to achieve this, we have some standard software designs principles to follow. Some of them are:
- SOLID
- CUPID
- GRASP

> Will cover the SOLID design principle only because it is the most implemented and popular among software domain .
>We will understand SOLID design principle by designing a `Bird`.

Without knowing design principles how we will create a `Bird`
[Version 0](/code/DesignPrinciples/DesigningBird/v_0/Main.java)
The issues in above code:
- There is excessive use of if-else/ Switch case.
- No Readability
- No Testability
- No Re-usability
- Multiple reasons to change the methods.
- Monster methods or God Classes

So above violation can be resolved by using **SRP**.

### **S**: Single Responsibility Principle
- A class should have only one reason to change, meaning it should have only one responsibility.
- Each class should encapsulate a single responsibility or part of the functionality.
- Very subjective in nature.

### **O**: Open/Closed Principle
- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- The behavior of a module can be extended without modifying its source code.

SRP and OCP are complementary to each other. OCP says that class/modules/functions is open for extension and closed for
modification. SRP suggest that there will be a only a single reason to change it.
So we can implement these two principles in designing our `Bird`. So after updating **Version 0**, our
[**Version 1**](/code/DesignPrinciples/DesigningBird/v_1)
case study of `Bird` achieve these two principles and make our code more robust and maintainable.

>Point to remember:
> 
>How to decide which class to create if we are having two concrete classes and want to create parent class?
> 1. Do they have common state?
>   1. Yes: `Interface`
>   2. No
>      1. Do we need an object of Parent class?
>         - No: `Abstract`
>         - Yes: `Concrete Class`

So now we have completed version 1 of `Bird`. What if new requirement come that we want to add `Penguin` bird.
To make sure that penguin cannot fly?
- Make the fly method empty.
- Throw an exception

Why we should not give surprises to client?

[Uber Eats Payment Issue](https://www.linkedin.com/feed/update/urn:li:activity:6909229360352825344/)

To over the above issue we will refactor our  [**Version 2**](/code/DesignPrinciples/DesigningBird/v_2)

Now from above code we can say the problem is addressed and used efficiently.
But a new problem arises that - what if there are more features of differentiation like `Dancable` and many more it will
lead to `Class Explosion`.

This will bring to our next design principle


### **L**: Liskov's Substitution Principle
- states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness
of the program.
- Child class should behave as parent wants them to behave.
- No child class should give a special meaning to the parent class's behaviour.

For example:
```java
// Rectangle.java
public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

// Square.java
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // Violates LSP
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    // Violates LSP
    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area()); // Output: 20.0

        Square square = new Square(4);
        System.out.println(square.area());    // Output: 16.0

        square.setWidth(5);
        System.out.println(square.area());    // Output: 25.0 (Expected: 20.0)
    }
}

```
As you can see, changing the width of the Square using the inherited setWidth() method doesn't behave as expected. This
violates the Liskov Substitution Principle, as substituting a Square for a Rectangle leads to unexpected behavior.

Implementation of LSP:
```java
// Shape.java
public interface Shape {
    double area();
}

// Rectangle.java
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Square.java
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
public class Main {
    public static void printArea(Shape shape) {
        System.out.println(shape.area());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        printArea(rectangle); // Output: 20.0

        Square square = new Square(4);
        printArea(square);    // Output: 16.0
    }
}

```
You can substitute objects of `Rectangle` and `Square` classes in places where a `Shape` is expected, and the behavior
remains consistent and as expected.

For `Bird` design [**Version 3**](/code/DesignPrinciples/DesigningBird/v_3)
### **I**: Interface Segregation Principle
- It states that clients should not be forced to depend on interfaces they do not use. In other words, it advocates for
the creation of specific, narrowly-focused interfaces rather than large, monolithic ones. This helps prevent unnecessary
coupling between classes and promotes a more modular and maintainable codebase.
```java
// Interface Segregation Principle Violation
interface Worker {
    void work();
    void eat();
}

class Human implements Worker {
    public void work() {
        System.out.println("Working...");
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Robot implements Worker {
    public void work() {
        System.out.println("Working...");
    }

    public void eat() {
        // Robots don't eat, so this method is meaningless for them
        // But they are forced to implement it due to the Worker interface
        System.out.println("Robot cannot eat!");
    }
}

```
In this example, both `Human` and `Robot` classes implement the `Worker` interface, which includes both `work()` and
`eat()`methods. However, the `eat()` method is meaningless for the `Robot` class, violating the Interface Segregation
Principle.
To adhere to the Interface Segregation Principle, we can split the Worker interface into smaller, more cohesive
interfaces:
```java
// Interface Segregation Principle Adherence
interface Workable {
    void work();
}

interface Feedable {
    void eat();
}

class Human implements Workable, Feedable {
    public void work() {
        System.out.println("Working...");
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Working...");
    }
}

```
### **D**: Dependency Inversion Principle
states that high-level modules should not depend on low-level modules, but both should depend on abstractions.
Additionally, it emphasizes that abstractions should not depend on details; rather, details should depend on
abstractions. This principle helps in writing more flexible, maintainable, and testable code by reducing coupling
between modules and promoting the use of interfaces or abstract classes to decouple components.
```java
// Dependency Inversion Principle Violation
class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb();
    }

    public void toggle() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}

class LightBulb {
    private boolean isOn;

    public LightBulb() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }

    public boolean isOn() {
        return isOn;
    }
}

```

The Dependency Inversion Principle (DIP) is one of the SOLID principles of object-oriented design. It states that high-level modules should not depend on low-level modules, but both should depend on abstractions. Additionally, it emphasizes that abstractions should not depend on details; rather, details should depend on abstractions. This principle helps in writing more flexible, maintainable, and testable code by reducing coupling between modules and promoting the use of interfaces or abstract classes to decouple components.

Here are some key points to consider when applying the Dependency Inversion Principle:

Abstraction: Define interfaces or abstract classes to represent higher-level abstractions and dependencies. These abstractions should capture the essential behavior or functionality required by the components.

Decoupling: Components should depend on abstractions rather than concrete implementations. This reduces the direct dependency between classes and allows for easier substitution of components without modifying the high-level modules.

Inversion of Control (IoC): DIP often goes hand in hand with Inversion of Control (IoC) containers or frameworks. IoC containers manage the creation and lifecycle of objects, injecting dependencies into the dependent components, and thus facilitating adherence to the Dependency Inversion Principle.

Testability: By relying on abstractions and interfaces, code becomes more testable. Dependencies can be easily mocked or stubbed during unit testing, allowing for isolated testing of components.

Flexibility and Extensibility: DIP promotes a design that is more flexible and extensible. Components can be easily replaced or extended by providing alternative implementations that adhere to the same abstractions.

Here's a simple example in Java to illustrate the Dependency Inversion Principle:

```java
// Dependency Inversion Principle Violation
class LightSwitch {
private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb();
    }

    public void toggle() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}

class LightBulb {
private boolean isOn;

    public LightBulb() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }

    public boolean isOn() {
        return isOn;
    }
}
```
In this example, the LightSwitch class directly depends on the LightBulb class, violating the Dependency Inversion
Principle. Instead, LightSwitch should depend on an abstraction (interface or abstract class) that represents the
functionality of a light bulb, allowing for different implementations of light bulbs to be used.

```java
// Dependency Inversion Principle Adherence
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightSwitch {
    private Switchable switchable;

    public LightSwitch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void toggle() {
        if (switchable.isOn()) {
            switchable.turnOff();
        } else {
            switchable.turnOn();
        }
    }
}

class LightBulb implements Switchable {
    private boolean isOn;

    public LightBulb() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }

    public boolean isOn() {
        return isOn;
    }
}

```
Now, LightSwitch depends on the Switchable interface instead of the LightBulb class directly, adhering to the Dependency
Inversion Principle. This allows for greater flexibility, as different implementations of Switchable can be provided
without modifying the LightSwitch class.

The updated  and last version of `Bird` design.
[Version 4](/code/DesignPrinciples/DesigningBird/v_4)