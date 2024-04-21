### Java Interview Questions
- What is Abstraction? Explain it through code?
```
Abstraction is primarily achieved through the use of abstract classes and interfaces.

1. Abstract Classes
An abstract class is a class that cannot be instatiated and may contain abstract methods,concrete methods or both.
Abstract methods are declared without any imlementation and must be implemented by concrete subclasses.
Abstract classes are used to define common characteristics and behaviors of related classes while allowing subclasses
to provide specific implementations.

//Abstract Class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void eat() {
        System.out.println("Animal is eating."); // Concrete method
    }
}

//Concrete Subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks."); // Implementation of abstract method
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Dog barks.
        animal.eat(); // Output: Animal is eating.
    }
}


2. Interfaces
An interface in java is areference type,similar to class,that can contain only
    - abstract methods
    - default methods
    - static methods
    - constants   
The interfaces support multiple inheritance.

interface Animal {
    void makeSound(); // Abstract method
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks."); // Implementation of abstract method
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Dog barks.
    }
}


----Summary----
- Use abstract classes when you have a base class with some common functionality
  that can be reused across multiple subclasses, and you want to provide a default
  implementation for some methods.
- Use interfaces when you want to define a contract specifying a set of methods
  that a class must implement, especially when achieving multiple inheritance of
  type or defining a lightweight, unifying type system for unrelated classes.
```
- Interface and its demo
```
In Java, an interface is a reference type, similar to a class,
that can contain only constants, method signatures, default methods,
static methods, and nested types. Interfaces cannot contain instance fields or constructors.

interface Animal {
    // Constant
    int LEGS = 4;

    // Method signature
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("Zzz");
    }

    // Static method
    static void breathe() {
        System.out.println("Inhale, exhale");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Woof
        myDog.sleep();      // Output: Zzz

        Animal.breathe();  // Output: Inhale, exhale
    }
}

```
- Difference between `comparable` and `comparator`
```
Comparable and comparator are interfaces used for sorting objects.

1.Comparable
    - The Comparable interface is used to define the natural ordering of objects.
    - It is implemented by the class whose objects are to be sorted.
    - It contains only one method, compareTo(), which compares the current object with another object.
    - The compareTo() method returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object, respectively.
    
    
    import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare persons based on their age
        return this.age - other.age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}



2. Comparator Interface
    - The Comparator interface is used to define custom ordering of objects.
    - It is often used when you want to sort objects based on criteria other
      than their natural ordering or when you don't have control over the class
      whose objects you want to sort.
    - It contains two methods, compare() for comparing two objects, and equals()
      for checking if the passed object is equal to the comparator.
      
      
  import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        // Sorting based on name using Comparator
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

```
- Difference between `final`,`finally` and `finalize`.
```
**Final**
is keyword used for making constants,methods and classes.
- When applied to a variable, it means that the variable's
  value cannot be changed once initialized.
- When applied to a method, it means that the method cannot be overridden by subclasses.
- When applied to a class, it means that the class cannot be subclassed.

final int x = 10;

**finally**
finally is a block used in exception handling along with try and catch.
The code inside a finally block is always executed regardless of whether an exception occurs or not.
It's commonly used for cleanup operations such as closing files or releasing resources.

try {
    // Code that may throw an exception
} catch (Exception e) {
    // Exception handling
} finally {
    // Cleanup operations
}


**finalize**
finalize is a method provided by the Object class.
It is called by the garbage collector before an object is destroyed.
It can be overridden to perform cleanup or releasing resources before the object is garbage collected.
However, its usage is discouraged as it's not guaranteed when or if it will be called, and it can impact performance.

```
- Difference between `static` and `non static` method.
```
---------------------------------------
|       Static       |    Non-static   |
---------------------------------------
| Belongs to class   | Associated with |
| Can be called on   | Can access and  |
| class              | modify instance |
| itself             | variables and   |
|                    | other methods   |
|                    | of the class    |
---------------------------------------

```
- Difference between `Runnable` and `Callable` interface.
```
Both Runnable and Callable are interfaces in Java used for defining tasks that can be executed by threads, but they have some differences:

Return value:
Runnable doesn't return any value because its run() method doesn't have a return type.
Callable can return a result. It has a method call() that returns a result and can throw an exception.
Exception handling:
With Runnable, if your task throws an exception, you need to handle it within the run() method.
Callable allows the call() method to throw a checked exception, which can be caught or declared to be thrown by the calling code.
Usage with Executors:
Runnable is typically used with the Executor framework for executing tasks asynchronously.
Callable is also used with the ExecutorService, which is an extension of Executor, but it allows returning a result and handling exceptions more effectively.
Generics:
Callable is a generic interface, allowing you to specify the type of the result returned by the call() method.
Runnable is not generic; it doesn't allow you to specify any return type.
```
- What is `Thread` safety and how it can be ensured in Java.
```
Thread safety is the ability of piece of code to function correctly and predictably in multithreaded environment.
 In a multithreaded program, multiple threads of execution can access shared resources concurrently.
 Without proper synchronization mechanisms, this can lead to race conditions, data corruption, and other concurrency issues.
 
 Some ways to ensure thread safety in java
 
 Synchronization: Use the synchronized keyword to ensure that only one thread can execute a synchronized block of code
 or method at a time. This prevents multiple threads from accessing shared resources concurrently.
 public synchronized void synchronizedMethod() {
    // Thread-safe code
}



Locks: Utilize explicit locks such as ReentrantLock to control access to shared resources. This provides more
flexibility compared to intrinsic locks (synchronized blocks) as it allows for finer-grained control over locking and
unlocking.
private final Lock lock = new ReentrantLock();

public void someMethod() {
    lock.lock();
    try {
        // Thread-safe code
    } finally {
        lock.unlock();
    }
}



Thread-safe data structures: Java provides thread-safe implementations of common data structures in the
java.util.concurrent package, such as ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue.
These data structures are designed to be used in multithreaded environments without additional synchronization.


Immutable objects: Design classes to be immutable whenever possible. Immutable objects cannot be modified after
creation, so they are inherently thread-safe and can be safely shared between threads without synchronization.



Atomic variables: Use atomic variables from the java.util.concurrent.atomic package to perform atomic operations
on primitive data types. These operations are guaranteed to be thread-safe without explicit synchronization.
```
- `HashMap` and internal working of it
```
A HashMap is a data structure used to store key-value pairs where each key is mapped to a unique value. It offers fast retrieval and insertion of elements. The internal working of a HashMap typically involves an array of "buckets" or "slots", where each bucket can hold multiple key-value pairs. The primary operations on a HashMap are put(key, value), get(key), and remove(key).

Here's a simplified explanation of how a HashMap works internally:

Hashing: When you put a key-value pair into the HashMap, the key is hashed to determine the index where the entry will be stored in the array. This hashing process should ideally distribute keys uniformly across the array.
Bucket Storage: Each index in the array is a bucket. If two or more keys hash to the same index (a collision), the HashMap handles this by storing a linked list or a binary search tree (depending on the implementation) of key-value pairs at that index. This means multiple key-value pairs can reside in the same bucket.
Retrieval: When you get a value associated with a key, the HashMap hashes the key to find the corresponding bucket, then searches through the linked list or binary search tree (if collisions exist) at that bucket to find the specific key-value pair.
Insertion and Updates: When you put a key-value pair, the HashMap hashes the key to find the appropriate bucket. If there are no collisions, the key-value pair is added to the bucket. If a collision occurs, the HashMap typically uses a method like chaining (using linked lists) or open addressing to handle it.
Resizing: As the number of elements in the HashMap grows, it may become necessary to increase the size of the underlying array to maintain performance. This process is called resizing. When resizing occurs, all key-value pairs are rehashed and redistributed into the new, larger array.
Load Factor: The load factor is a measure of how full the HashMap is allowed to get before resizing. When the number of elements exceeds a certain percentage of the capacity (load factor), the HashMap automatically increases the size of the array and redistributes the elements.
```
- Streams and its demo
```
Streams in Java are a powerful feature introduced in Java 8 that allow for functional-style operations on sequences of elements, such as collections. They provide a concise and expressive way to perform operations like filtering, mapping, sorting, and reducing on collections.

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example 1: Filtering even numbers
        System.out.println("Example 1: Filtering even numbers");
        numbers.stream()
               .filter(n -> n % 2 == 0) // Keep only even numbers
               .forEach(System.out::println); // Print each even number

        // Example 2: Mapping each number to its square
        System.out.println("\nExample 2: Mapping each number to its square");
        numbers.stream()
               .map(n -> n * n) // Map each number to its square
               .forEach(System.out::println); // Print each squared number

        // Example 3: Reducing the numbers to their sum
        System.out.println("\nExample 3: Reducing the numbers to their sum");
        int sum = numbers.stream()
                        .reduce(0, Integer::sum); // Start with 0 and accumulate sum
        System.out.println("Sum of numbers: " + sum);
    }
}

```
- Difference between `Stringbuffer` and `StringBuilder`.
```
StringBuffer and StringBuilder are both classes in Java used for string manipulation, but they have differences primarily related to thread safety and performance.

Thread Safety:
StringBuffer is thread-safe, meaning it's synchronized, allowing multiple threads to manipulate the same StringBuffer object without causing data corruption or inconsistencies.
StringBuilder is not thread-safe. It does not provide synchronization, so it's faster in a single-threaded environment, but it's not safe to use in scenarios where multiple threads may access the same object concurrently.
Performance:
Because StringBuffer is synchronized, its methods have overhead due to acquiring and releasing locks, making it slower compared to StringBuilder.
StringBuilder is not synchronized, leading to better performance, especially in scenarios where thread safety is not a concern.
Here's a summarized comparison:

| Aspect          | StringBuffer                        | StringBuilder                      |
|-----------------|-------------------------------------|------------------------------------|
| Thread Safety   | Thread-safe (synchronized)          | Not thread-safe                    |
| Performance     | Slower due to synchronization      | Faster due to lack of synchronization |


Performance	Slower due to synchronization overhead	Faster due to lack of synchronization
In most scenarios where thread safety is not a concern, StringBuilder is preferred due to its better performance. However, if you're working in a multi-threaded environment and need thread safety, StringBuffer should be used.
```