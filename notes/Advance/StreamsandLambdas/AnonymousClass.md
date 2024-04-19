### Anonymous Class

```java
// --- Concrete Class
public class A {
    public void sayHi() {
        System.out.println("Hi");
    }
}

public static void main(String[] args) {
    A a = new A() {
        @Override
        public void sayHi() {
            System.out.println("Hello");
        }
    };
}


// --- Abstract/Interface

public interface A {
    void sayHi();
}

public static void main(String[] args) {
    A a = new A() {
        @Override
        public void sayHi() {
            System.out.println("Hi");
        }
    };
}
```
Through anonymous class we don't actually need to create a second class to extend or implement the parent class.

>When to use it?

Specific or one-off use case we will use anonymous class.
Like if I want to use it one time.

If we want reusability then we should create a normal class.

### Functional Interface
are those interfaces which have single abstract method (SAM).

```java

@FunctionalInterface
interface B{
    void b();
}
```