### Open Closed Principle
> Open for extension, close for modification.

Suppose we add a new method the earlier code will not be that much affected.
But if we modify the code the after effect of that code functionality will be propagated further.

Let us fix our bird code
[Version 1](../../code/SRP/v1/Bird.java)

So to separate the responsibility as a single unit of code.We will create separate bird class with their own `fly()`
method.

We understand that `Bird` class will have `fly()` method and that method can be implemented by different type of birds.
Thus, we can inherit the `fly()` method from `Bird`.
Now to understand what are the different types of implementation can we use
- Concrete Class
- Abstract Class
- Interfaces

To understand what to use? We should ask questions like:
- Do child class have **common states**? If no use `Interfaces`. If yes
  - Do we need **object** of parent class? If no, use `Abstract class`, else use `Concrete class` 

The **code** is here after implementing **OCP**: [Version 2](../../code/OCP/v2/Bird.java)