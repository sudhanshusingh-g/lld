The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex system, library, or set of classes. It encapsulates a group of interfaces in a higher-level interface, making the subsystem easier to use and understand. Facade pattern promotes loose coupling by hiding the complexities of the underlying system and providing a unified interface for the client to interact with.


The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex system, library, or set of classes. It encapsulates a group of interfaces in a higher-level interface, making the subsystem easier to use and understand. Facade pattern promotes loose coupling by hiding the complexities of the underlying system and providing a unified interface for the client to interact with.

Key components of the Facade pattern:

**Facade**: This is the central component of the pattern. It provides a simplified interface to the client for accessing the subsystem or a set of related interfaces. The Facade delegates client requests to the appropriate objects within the subsystem.

**Subsystems**: These are the various classes, components, or systems that make up the underlying complexity. The Facade interacts with these subsystems on behalf of the client, shielding the client from their complexities.

```java
// Subsystem components
class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem1: Operation 1");
    }
}

class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem2: Operation 2");
    }
}

class Subsystem3 {
    public void operation3() {
        System.out.println("Subsystem3: Operation 3");
    }
}

```

```java
//Facade
class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
        this.subsystem3 = new Subsystem3();
    }

    public void doTask() {
        System.out.println("Facade is doing a task...");
        subsystem1.operation1();
        subsystem2.operation2();
        subsystem3.operation3();
    }
}
```

```java
// Client code
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doTask(); // Client interacts with the Facade to perform a task
    }
}
```
### When to use
The Facade pattern is a useful tool in software design for simplifying complex systems and providing a unified interface to interact with them. Here are some scenarios where using the Facade pattern is beneficial:

Complex subsystems: When dealing with complex subsystems consisting of numerous classes, components, or APIs, the Facade pattern can simplify interactions by providing a single entry point. This is particularly useful when the subsystem's internal structure is intricate and may change over time.

Client code simplification: If the client code needs to interact with multiple classes or subsystems and managing these interactions becomes cumbersome, a Facade can encapsulate the complexity and present a simpler interface to the client. This promotes readability and maintainability of client code.

Legacy system integration: When integrating with legacy systems that have outdated or convoluted interfaces, a Facade can serve as an adapter to modernize interactions with the legacy system. It shields the client code from the complexities of the legacy system's interface.

Library or API abstraction: When working with third-party libraries or APIs, especially ones with complex interfaces or multiple dependencies, a Facade can provide a simplified interface tailored to the specific needs of the application. This abstraction shields the application from changes in the external library's implementation details.

Performance optimization: In systems where performance is critical, a Facade can optimize interactions with subsystems by providing optimized access patterns, caching mechanisms, or resource management strategies. This can improve overall system performance without exposing the complexity to the client code.

Promoting decoupling and encapsulation: By using a Facade, you can decouple the client code from the details of the subsystem's implementation. This promotes encapsulation and reduces dependencies between subsystems and clients, making the system more modular and easier to maintain.

Testing and debugging: Facades can simplify testing and debugging processes by providing a clear boundary between the client code and the subsystem. Test cases can focus on the interactions with the Facade, making it easier to isolate and verify functionality.

| Aspect            | Facade Pattern                               | Adapter Pattern                               |
|-------------------|----------------------------------------------|-----------------------------------------------|
| Purpose           | Simplifies a complex subsystem by providing a unified interface. | Allows objects with incompatible interfaces to work together. |
| Usage             | Used to provide a simplified interface to a complex system or set of classes. | Used to make classes with incompatible interfaces work together. |
| Relationship      | Provides a higher-level interface to a subsystem, but does not change its interface. | Wraps an existing interface to make it compatible with another interface. |
| Collaboration     | Aggregates and delegates calls to subsystem components. | Translates requests from one interface to another, allowing objects to collaborate. |
| Involves          | Typically involves one Facade per subsystem, encapsulating its complexity. | Involves one Adapter per incompatible interface pair, adapting one interface to another. |
| Changes in system | Changes to the internal structure of the subsystem may require modifications to the Facade. | Changes to the interfaces of existing classes may require modifications to the Adapter. |
| Client awareness  | The client is aware of the existence of the Facade and interacts with it directly. | The client may not be aware of the presence of the Adapter, as it presents a compatible interface. |
| Use case example  | Providing a simplified interface for a complex library. | Allowing a new component to interact with an existing system with a different interface. |
