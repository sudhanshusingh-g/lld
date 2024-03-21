Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

Key components of the Flyweight pattern:

Flyweight Factory: This is responsible for creating and managing flyweight objects. It typically maintains a pool of flyweight objects and provides methods for clients to retrieve or create flyweight objects based on certain criteria.

Flyweight: This is the interface or abstract class shared by flyweight objects. It defines methods to set and get intrinsic state, which is shared among multiple flyweight objects. Intrinsic state represents the common, immutable data shared by flyweights.

Concrete Flyweight: This is the concrete implementation of the Flyweight interface. It contains the intrinsic state and implements methods defined by the Flyweight interface.

Client: This is the entity that uses flyweight objects. Clients can request or retrieve flyweight objects from the flyweight factory and use them to perform operations.

```java
// Flyweight interface
interface Character {
    void display(int fontSize);
}

// Concrete Flyweight
class CharacterImpl implements Character {
    private char symbol;

    public CharacterImpl(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int fontSize) {
        System.out.println("Symbol: " + symbol + ", Font Size: " + fontSize);
    }
}

// Flyweight Factory
class CharacterFactory {
    private Map<Character, Character> characters = new HashMap<>();

    public Character getCharacter(char symbol) {
        if (!characters.containsKey(symbol)) {
            characters.put(symbol, new CharacterImpl(symbol));
        }
        return characters.get(symbol);
    }
}

// Client code
public class TextEditor {
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void displayText(String text, int fontSize) {
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c);
            character.display(fontSize);
        }
    }
}

```

The Flyweight pattern is useful in scenarios where you need to efficiently manage a large number of objects that share common state, and memory usage and performance are critical concerns. Here are some situations where using the Flyweight pattern is appropriate:

Large number of objects: When dealing with a system that involves a large number of objects that share similar properties or behavior, such as graphical elements in a game or user interface, the Flyweight pattern can help minimize memory usage by sharing common state among objects.

Limited memory resources: In resource-constrained environments, where memory resources are limited, the Flyweight pattern can help reduce memory consumption by sharing common state and avoiding the creation of redundant objects.

Performance optimization: In performance-critical applications, such as real-time simulations or rendering engines, minimizing memory allocation and reducing the overhead of object creation and destruction can significantly improve performance. The Flyweight pattern helps achieve this by reusing existing objects and minimizing the overhead of managing object state.

Caching and resource pooling: The Flyweight pattern is often used in caching and resource pooling scenarios, where objects with similar properties or behavior are cached or pooled to improve resource utilization and reduce latency.

Immutable objects: When dealing with immutable objects, where object state cannot be modified after creation, the Flyweight pattern is particularly effective because it allows multiple objects to share the same immutable state without compromising the integrity of the objects.

Shared data in concurrent systems: In concurrent or multithreaded systems, where multiple threads need to access and modify shared data concurrently, the Flyweight pattern can help minimize synchronization overhead by allowing threads to share common state without the need for explicit synchronization.

[Shooting Game](/code/DesignPattern/Structural/Flyweight/ShootingGame.java)