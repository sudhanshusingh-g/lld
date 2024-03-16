## Wrapper Classes
- Java has few primitive data types which makes Java 99.99% Object-Oriented.
- Wrapper classes are those classes which encapsulate primitive data types provides lots of utility functions.
- Wrapper classes are often used with collections in Java

Autoboxing Unboxing are automatic conversions b/w primitive their corresponding wrapper classes.

## Object Classes
Object class is the root parent class of all the classes in Java. It is present in `java.lang` package.
Since all the classes implicitly or explicitly inherit from Object class it provides lots of fundamental methods like:
- `toString`
- `equals()`
- `hashCode()`
- `getClass()`
- `finalize()`


## Generics
Consider you want to make a class which prints integers called as `IntegerPrinter`.Now there is requirement to print
double,string,long etc.
You need to create a class for each of these types. Also this will lead to **Class Explosion** if there are large
members.
To solve this :
1. we will create an [Object Class](/code/AdvanceJava/Generics/ObjectClass/Main.java), since it is the wrapper class of all the types.
But the issue is that:
   1. Every new type to use we have to typecast it.
   2. Typecasting is error-prone,but the error is not provided at compile-time,it is provided at run-time and will get
   error like `ClassCastException`
2. Hence, we use [Generics Class](/code/AdvanceJava/Generics/GenericClass/Main.java)