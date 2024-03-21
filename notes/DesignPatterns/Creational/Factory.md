The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is useful when you want to delegate the responsibility of object instantiation to subclasses, thereby promoting loose coupling between the client code and the objects being created.

### When to use?

The Factory Design Pattern is appropriate to use in various scenarios, including:

- Object creation based on runtime conditions: When you need to instantiate objects dynamically at runtime based on certain conditions or parameters, such as user input, configuration settings, or environmental variables, the Factory pattern can be helpful. It allows you to encapsulate the object creation logic within factory classes, making it easy to switch between different object implementations based on runtime conditions.

- Decoupling object creation from client code: If your application needs to create instances of objects but you want to avoid exposing the details of object creation to the client code, the Factory pattern can provide a clean separation between object instantiation and client code. This promotes loose coupling and makes the client code easier to maintain and test.

- Creating objects with complex initialization logic: When creating objects involves complex initialization logic or requires the involvement of multiple classes, the Factory pattern can help encapsulate this logic within dedicated factory classes. This keeps the client code clean and focused, as it does not need to deal with the complexities of object creation.

- Supporting multiple object creation algorithms or strategies: If you have multiple algorithms or strategies for creating objects, the Factory pattern can be used to encapsulate each creation algorithm within separate factory classes. This allows you to easily switch between different creation strategies by using different factory implementations without modifying the client code.

- Managing object lifecycle: In some cases, you may need to manage the lifecycle of objects, such as pooling objects for reuse or caching objects to improve performance. The Factory pattern can be extended to incorporate such lifecycle management features, ensuring efficient resource utilization and improving overall application performance.

Overall, the Factory Design Pattern is useful in situations where you want to centralize and encapsulate object creation logic, promote loose coupling between components, and provide flexibility to adapt to changing requirements or runtime conditions.

[Product](/code/DesignPattern/Creational/Factory/Client.java)