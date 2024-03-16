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
[Version 0](/code/DesignPrinciples/v_0/Main.java)
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
So we can implement these two principles in designing our `Bird`. So after updating **Version 0**, our [Version 1](/code/DesignPrinciples/SRPandOCP)
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

[Uber Eats Payment Issue](https://www.linkedin.com/posts/rplusg_story-bigtech-uber-activity-6956970566192939008-9rqb/?originalSubdomain=in)

To over the above issue we will refactor our code [Version 2](/code/DesignPrinciples/v_2)

Now from above code we can say the problem is addressed and used efficiently.
But a new problem arises that - what if there are more features of differentiation like `Dancable` and many more it will
lead to `Class Explosion`.

### **L**: Liskov's Substitution Principle
### **I**: Interface Segregation Principle
### **D**: Dependency Inversion Principle



