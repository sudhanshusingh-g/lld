The Strategy Pattern is a behavioral design pattern that enables an algorithm's behavior to be selected at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm to vary independently from the client that uses it.

### Structure
- Context: This is the class that maintains a reference to the current strategy object. It also provides an interface for clients to invoke the algorithm.
- Strategy: This is the interface or abstract class that defines the contract for all concrete strategies.
- Concrete Strategies: These are the concrete implementations of the strategy interface, each representing a different algorithm.

### When to Use
- Use the Strategy Pattern when you want to define a family of algorithms, encapsulate each one, and make them interchangeable.
- Use it to avoid exposing complex, algorithm-specific code in client classes.
- Use it when you have several related classes that differ only in their behaviors.
- Use it to select an algorithm at runtime based on dynamic requirements or configurations.

[Code](/code/DesignPattern/Behavioral)