**Prototype** is a creational design pattern that lets you copy existing objects without making your code dependent on
their classes.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned.This can be useful when the construction of a new object is more efficient by copying an existing one, rather than creating it from scratch.

How it is implemented? See below:

```java
// Prototype interface
interface Prototype {
    Prototype clone();
}
```
The Prototype interface declares the cloning methods. In most cases, it’s a single clone method.

```java
// Concrete prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }
}
```

The Concrete Prototype class implements the cloning method. In addition to copying the original object’s data to the clone, this method may also handle some edge cases of the cloning process related to cloning linked objects, untangling recursive dependencies, etc.

```java
// Client class
public class PrototypePatternExample {
    public static void main(String[] args) {
        // Create a prototype object
        ConcretePrototype prototype = new ConcretePrototype("Prototype 1");

        // Clone the prototype to create new objects
        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        clone1.setName("Clone 1");

        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        clone2.setName("Clone 2");

        // Output
        System.out.println("Original Prototype: " + prototype.getName());
        System.out.println("Clone 1: " + clone1.getName());
        System.out.println("Clone 2: " + clone2.getName());
    }
}
```
The Client can produce a copy of any object that follows the prototype interface.

When to use **Prototype**:
- Creating objects is costly:
- Avoiding subclassing: Sometimes, you may have a class hierarchy where the number of subclasses that you need to support is dynamic or unknown. In such cases, the Prototype pattern allows you to create new objects by cloning existing ones, eliminating the need for subclassing.
- Hiding complexity
- Customizing object creation

[Code example](/code/DesignPattern/Creational/Prototype/Main.java)