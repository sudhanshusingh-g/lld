## Java Collections Framework

The Java Collections Framework (JCF) is a set of classes and interfaces that implement commonly reusable collection data structures. The JCF is organized into interfaces and implementations of those interfaces. The interfaces define the functionality of the collection data structures, and the implementations provide concrete implementations of those interfaces.

The advantages of using the JCF are:
* **Consistent API** - The API has a basic set of interfaces like Collection, Set, List, or Map, all the classes (ArrayList, LinkedList, Vector, etc) that implement these interfaces have some common set of methods.
* **Reduces programming effort** - A programmer doesn’t have to worry about the design of the Collection but rather he can focus on its best use in his program. Therefore, the basic concept of Object-oriented programming (i.e.) abstraction has been successfully implemented.
* **Increases program speed and quality** - Increases performance by providing high-performance implementations of useful data structures and algorithms because in this case, the programmer need not think of the best implementation of a specific data structure. He can simply use the best implementation to drastically boost the performance of his algorithm/program.

![JCF](https://cdn.programiz.com/sites/tutorial2program/files/Java-Collections.png)

### Collection Interface

The Collection interface is the root interface of the Java Collections Framework. It is the foundation upon which the collection framework is built. It declares the core methods that all collections will have. The Collection interface is a part of the java.util package.

The JDK does not provide any direct implementations of this interface: it provides implementations of more specific sub-interfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.

The Collection interface includes various methods that can be used to perform different operations on objects. These methods are available in all its subinterfaces.

* `add()` - inserts the specified element to the collection
* `size()` - returns the size of the collection
* `remove()` - removes the specified element from the collection
* `iterator()` - returns an iterator to access elements of the collection
* `addAll()` - adds all the elements of a specified collection to the collection
* `removeAll()` - removes all the elements of the specified collection from the collection
* `clear()` - removes all the elements of the collection

### List Interface

The List interface extends the Collection interface. It is an ordered collection of objects in which duplicate values can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements. List Interface is implemented by:
* `ArrayList` - Resizable-array implementation of the List interface
* `LinkedList` - Doubly-linked list implementation of the List and Deque interfaces
* `Vector` - Synchronized resizable-array implementation of the List interface
* `Stack` - Subclass of Vector that implements a standard last-in, first-out stack

![List](https://cdn.programiz.com/sites/tutorial2program/files/Java-list-interface.png)

### Set Interface

The Set interface extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set.

![Set](https://cdn.programiz.com/sites/tutorial2program/files/java-set-implementation.png)

Set is implemented by:
* `HashSet` - It represents the unordered set of elements which doesn't allow us to store the duplicate items. It is the best approach for search operations.
* `LinkedHashSet` - It represents the ordered set of elements which doesn't allow us to store the duplicate items. It is the child class of HashSet.
* `TreeSet` - It contains unique elements only like HashSet. The TreeSet class implements NavigableSet interface that extends the SortedSet interface. It maintains ascending order.
* `EnumSet` - It is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.

### Map Interface

The map is an object that stores the data in the form of key-value pairs. The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit different from the rest of the collection types.

![Map](https://cdn.programiz.com/sites/tutorial2program/files/java-map-subclasses.png)

The Map interface is implemented by:
* `HashMap` - It represents the implementation of the Map interface. It represents a mapping between a key and a value. It inherits AbstractMap class and implements Map interface.
* `LinkedHashMap` - It represents the implementation of the Map interface and extends the HashMap class. Like HashMap, It also contains unique elements. It maintains the insertion order and permits null elements.
* `TreeMap` - It represents the implementation of the Map interface that uses a tree for storage. Like HashMap, TreeMap also contains unique elements. However, the access and retrieval time of TreeMap is quite fast. The elements in TreeMap stored in the sorted and ascending order. It cannot contain the null key but can have multiple null values.
* `ConcurrentHashMap` - It is a thread-safe class that represents the implementation of the Map interface. It is used to store the key-value pairs. It is introduced in Java 1.5. It does not allow null keys and null values.