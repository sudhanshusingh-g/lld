## Annotations

Annotations are a form of metadata that provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate as they do not change the semantics of the compiled program. However, they are also not pure comments as they can be processed by compiler tools in some way. Annotations were added to the Java language in JDK 5.0.

Annotations are used for the following purposes:
* Information for the compiler — Annotations can be used by the compiler to detect errors or suppress warnings.
* Compile-time and deployment-time processing — Software tools can process annotation information to generate code, XML files, and so forth.

![Annotations](https://media.geeksforgeeks.org/wp-content/uploads/20211110125455/JavaAnnotations.jpg)

### Built-in Annotations

Java provides a set of built-in annotations that are available for general use. These annotations are used by the compiler and other tools. Built-in annotations can be divided into the following categories:
* General-purpose annotations - `java.lang.*` - These annotations are used by the compiler to detect errors, suppress warnings and enable or disable compile-time and deployment-time processing of annotations.
* Meta-annotations - `java.lang.annotation.*` - These annotations are used to create other annotations.

### Categories of Annotations

Annotations can be divided into the following categories:
* Marker annotations - These annotations contain no members. They simply mark the declaration to which they apply with some additional information. Example: `@Override`, `@Deprecated`, `@SuppressWarnings`.
* Single-value annotations - These annotations contain a single member. Example: `@SuppressWarnings("unchecked")`.
* Full annotations - These annotations contain multiple members. Example: `@Author(name = "John Doe", date = "3/17/2002")`.

There are other sub-categories such as type and repeating annotations.

---