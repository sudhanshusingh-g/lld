Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
It allows classes with incompatible interfaces to work together by creating a wrapper or intermediary class that converts the interface of one class into another interface that a client expects


The Adapter Design Pattern is a structural design pattern used to bridge the gap between two incompatible interfaces. It allows classes with incompatible interfaces to work together by creating a wrapper or intermediary class that converts the interface of one class into another interface that a client expects.

The Adapter pattern typically involves the following components:

**Target**: This is the interface that the client expects. It defines the desired interface that the client will interact with.

**Adaptee**: This is the existing interface that needs to be adapted. It's the class or component that needs to be integrated with the client code, but its interface is incompatible with the client's expectations.

**Adapter**: This is the class that bridges the gap between the Target and the Adaptee. It implements the Target interface and wraps an instance of the Adaptee. The Adapter then translates requests from the Target interface into calls to the appropriate methods of the Adaptee.

```java
// Target interface
interface Target {
    void request();
}

```

```java
// Adaptee
class Adaptee {
    void specificRequest() {
        System.out.println("Adaptee's specific request");
    }
}
```

```java
// Adapter
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
```

```java
// Client code
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request(); // Client interacts with the Adapter through the Target interface
    }
}
```

The Adapter pattern is useful in several scenarios, particularly when dealing with legacy systems, third-party libraries, or components with incompatible interfaces. Here are some situations where using the Adapter pattern is beneficial:

Integrating new components: When you need to integrate new components or classes into an existing system that expect a different interface, the Adapter pattern allows you to bridge the gap without modifying existing code.

Working with legacy code: When working with legacy code that uses outdated interfaces, you can create adapters to make it compatible with modern interfaces, thus facilitating the integration of legacy systems with newer components.

Reusing existing classes: If you have existing classes or components that you want to reuse in a different context where their interfaces are incompatible, you can create adapters to make them compatible with the desired interface without modifying their code.

Interacting with third-party libraries: When using third-party libraries or APIs that have different interfaces from what your application expects, you can create adapters to translate between the third-party interfaces and your application's interfaces.

Testing: In testing scenarios, you may need to mock or stub certain dependencies with simplified interfaces. Adapters can be used to adapt complex dependencies to simpler interfaces for easier testing.

Promoting code decoupling: By using adapters, you can decouple the client code from the implementation details of the adapted classes, promoting code maintainability and flexibility.

Versioning and evolution: When evolving an API or making changes to interfaces, adapters can provide a backward-compatible layer, allowing existing clients to continue working with the updated system without requiring immediate changes.

[Code](/code/DesignPattern/Structural/Adapter/Client.java)