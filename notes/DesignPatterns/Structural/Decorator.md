The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It is useful for extending functionality in a flexible and reusable way.

Key components of the Decorator pattern:

**Component**: This is the interface or abstract class defining the methods that will be implemented by concrete components and decorators.

**Concrete Component**: This is the basic implementation of the Component interface. It defines the core behavior that can be extended or modified by decorators.

**Decorator**: This is an abstract class that implements the Component interface and contains a reference to a Component instance. Decorators have the same interface as the Component they are decorating, allowing them to extend or modify the behavior of the Component.

**Concrete Decorators**: These are concrete subclasses of the Decorator class. They add specific behavior or modify existing behavior of the Component they decorate.

```java
// Component interface
interface Coffee {
    double getCost();
    String getDescription();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

// Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());
    }
}

```
The Decorator pattern is beneficial in various scenarios where you need to add or modify the behavior of objects dynamically, without altering their original classes. Here are some situations where using the Decorator pattern is appropriate:

Adding functionality to individual objects: When you want to add new features or behaviors to specific objects at runtime without affecting other instances of the same class, the Decorator pattern allows you to extend the functionality of individual objects dynamically.

Avoiding subclass proliferation: Instead of creating numerous subclasses to accommodate different combinations of behaviors, you can use decorators to add or remove features as needed, resulting in a more flexible and maintainable codebase.

Modifying behavior without altering existing code: If you need to modify the behavior of existing classes but cannot or do not want to modify their source code, the Decorator pattern provides a non-invasive way to extend their functionality by wrapping them with decorators.

Supporting open/closed principle: By using decorators, you can add new functionality to existing classes without modifying their source code, thereby adhering to the open/closed principle, which states that classes should be open for extension but closed for modification.

Combining behaviors dynamically: Decorators can be stacked or combined in various ways to create different configurations of behavior at runtime, allowing for flexible and dynamic object compositions.

Providing alternative configurations: Decorators can be used to provide alternative configurations or options for objects, allowing clients to choose the desired combination of features or behaviors.

Adding cross-cutting concerns: If you need to add cross-cutting concerns such as logging, caching, or security checks to multiple classes in a transparent and reusable manner, decorators can be used to encapsulate these concerns and apply them to objects as needed.


[Ice Cream Parlor](/code/DesignPattern/Structural/Decorator/IceCreamParlor.java)