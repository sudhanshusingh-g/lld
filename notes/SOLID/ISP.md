### Interface Segregation Principle (ISP)
Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.
The principle states that many client-specific interfaces are better than one general-purpose interface. Clients should 
not be forced to implement a function they do no need. Declaring methods in an interface that the client doesn’t need 
pollutes the interface and leads to a “bulky” or “fat” interface.

A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend 
on methods they do not use. In other words, we should not create fat interfaces. A fat interface is an interface that 
has too many methods. If we have a fat interface, we will have to implement all the methods in the interface even if we 
don’t use them. This is known as the interface segregation principle.

Let us take the example of our `Bird` class. To not tie the behaviour to the class hierarchy, we created an interface 
`Flyable` and implemented it in the `Eagle` and `Parrot` classes.

```java
public interface Flyable {
    void fly();
    void makeSound();
}
```
Along with the `fly()` method, we also have the `makeSound()` method in the `Flyable` interface. This is because the `Eagle` and `Parrot` classes both make sounds when they fly. But what if we have a class that implements the `Flyable` interface? The class does not make a sound when it flies. This is a violation of the interface segregation principle. We should not have the `makeSound()` method in the `Flyable` interface.

Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them. If a class exposes so many members that those members can be broken down into groups that serve different clients that don’t use members from the other groups, you should think about exposing those member groups as separate interfaces.

Precise application design and correct abstraction is the key behind the Interface Segregation Principle. Though it'll take more time and effort in the design phase of an application and might increase the code complexity, in the end, we get a flexible code.

Examples:
1. Uber eats payment problem
2. Bulk sms in practo using services from Twillo and Gupshup.