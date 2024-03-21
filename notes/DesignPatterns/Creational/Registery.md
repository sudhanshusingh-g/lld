
The "Registry" variant of the Prototype pattern involves using a centralized registry to manage and store prototype objects. Instead of directly cloning prototype objects, clients can request prototypes from the registry, which manages the creation and storage of prototypes. This approach allows for centralized control and management of prototypes and facilitates easy access for clients.

Here's an example of how you can implement the Registry variant of the Prototype pattern in Java:

```java
// Prototype interface
interface Prototype {
    Prototype clone();
}
```

```java
// Concrete prototype implementations
class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}

class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
```

```java
// Prototype registry
class PrototypeRegistry {
    private static Map<String, Prototype> prototypes = new HashMap<>();

    static {
        prototypes.put("Prototype1", new ConcretePrototype1());
        prototypes.put("Prototype2", new ConcretePrototype2());
    }

    public static Prototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
```

```java
// Client code
public class RegistryPrototypePatternExample {
    public static void main(String[] args) {
        // Get prototypes from the registry
        Prototype prototype1 = PrototypeRegistry.getPrototype("Prototype1");
        Prototype prototype2 = PrototypeRegistry.getPrototype("Prototype2");

        // Clone the prototypes
        Prototype clone1 = prototype1.clone();
        Prototype clone2 = prototype2.clone();

        // Output
        System.out.println("Clone 1 Type: " + clone1.getClass().getSimpleName());
        System.out.println("Clone 2 Type: " + clone2.getClass().getSimpleName());
    }
}
```

[Code Example](/code/DesignPattern/Creational/Prototype/Registry/Main.java)