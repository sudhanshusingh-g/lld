In machine coding round the `design` and `implementation` knowledge is evaluated.

- In machine coding round, generally **`one line problem`** statement will be given.
- We will ask questions to get the **`requirements`** details from
interviewer. Questions will involve **`current scope`** , `**Future Scope**` and `**Behavior**`
- `Entities` will be defined through the requirements.
- **`UML diagrams`** will be implemented based on requirements.
- After iteration best design should be `implemented` in code. 

# Designing a Pen: Case Study 

### Step 1: Problem Statement
- Design a pen.

### Step 2: Requirements
- A pen is anything that can write.
- Pen can be Gel, Ball, Fountain, Marker.
- Ball pen have ball pen refill and gel pen have gel pen refill.
- A refill has a tip and ink.
- Ink can be of different colour.
- A fountain pen has an Ink.
- Refill has radius.
- For fountain pen, its tip has a radius.
- Each pen can write in a different way.
- Some pens write in the same way.
- Every pen has a brand and a name.
- Some pens may allow refilling while others might not.

### Step 3: Entities and attributes.
 **Nouns** will be the entities.
1. Pen
2. Refill
3. Ink
4. Nib

- Pen has
  - Brand
  - Name
  - Type (Ball,Gel,Fountain,Throwable)
  - Price
  - Refill has
    - Ink has
      - Colour
      - Brand
      - Type (Ball,Gel,Type)
    - Nib has
      - Radius
      - Type (Ball,Gel,Type)

### Step 3: Class Diagram

>Version 1
```mermaid
classDiagram
  class Pen {
    -String brand
    -String name
    -PenType type
    -double price
    -Refill refill
    -Ink ink
    -Nib nib
    +write() void
  }

  class PenType {
    <<enumeration>>
    GEL
    BALL
    FOUNTAIN
    MARKER
    THROW_AWAY
  }

  class Refill {
    -RefillType type
    -Ink ink
    -Nib nib
    -boolean refillable
  }

  class RefillType {
    <<enumeration>>
    GEL
    BALL
  }

  class Ink {
    -String colour
    -String brand
    -InkType type
  }

  class InkType {
    <<enumeration>>
    GEL
    BALL
    FOUNTAIN
  }

  class Nib {
    -double radius
    -NibType type
  }

  class NibType {
    <<enumeration>>
    GEL
    BALL
    FOUNTAIN
  }

  Pen "*" --o  "1" PenType : has a
  Pen "1" --* "1" Refill : has a
  Pen "1" --* "1" Ink : has a
  Pen "1" --* "1" Nib : has a

  Refill "*" --* "1" RefillType : has a
  Refill "1" --* "1" Ink : has a
  Refill "1" --* "1" Nib : has a

  Ink "*" --* "1" InkType : has a

  Nib "*" --* "1" NibType : has a


```
### Problems
- **Single Responsibility Principle** is violated. There are multiple reasons to change the class such as modifying a single type of pen.
- **Open Closed Principle** is violated. Adding a new type of pen requires changing the class.
- **Null checks** are required for handling refill and ink for fountain pens.
- **Object creation** is complex

>Version 2
To overcome the above problems we use `Inheritance`
```mermaid
classDiagram
    class Pen {
        <<abstract>>
        -String brand
        -String name
        -PenType type
        -double price
        +write()* void
    }

    class GelPen {
        -Refill refill
        +write() void
    }

    class BallPen {
        -Refill refill
        +write() void
    }

    class FountainPen {
        -Ink ink
        +write() void
    }

    class ThrowawayPen {
        -Refill refill
        +write() void
    }

    class PenType {
        <<enumeration>>
        GEL
        BALL
        FOUNTAIN
        MARKER
        THROW_AWAY
    }

    class Refill {
        -RefillType type
        -Ink ink
        -Nib nib
        -boolean refillable
    }

    class RefillType {
        <<enumeration>>
        GEL
        BALL
    }

    class Ink {
        -String colour
        -String brand
        -InkType type
    }

    class InkType {
        <<enumeration>>
        GEL
        BALL
        FOUNTAIN
    }

    class Nib {
        -double radius
        -NibType type
    }

    class NibType {
        <<enumeration>>
        GEL
        BALL
        FOUNTAIN
    }

    Pen "*" --o  "1" PenType : has a


    Pen <|-- GelPen
    Pen <|-- BallPen
    Pen <|-- FountainPen
    Pen <|-- ThrowawayPen

    GelPen "1" --* "1" Refill : has a
    BallPen "1" --* "1" Refill : has a
    ThrowawayPen "1" --* "1" Refill : has a

    FountainPen "1" --* "1" Ink : has a
    FountainPen "1" --* "1" Nib : has a

    Refill "*" --* "1" RefillType : has a
    Refill "1" --* "1" Ink : has a
    Refill "1" --* "1" Nib : has a

    Ink "*" --* "1" InkType : has a

    Nib "*" --* "1" NibType : has a


```
### Problems
- Object creation is still complex.
- Liskov Substitution Principle is violated since FountainPen does not have a refill, and it throws an exception when
changeRefill is called.
- Code duplication
- Subclasses are used to create objects.

>Version 3
```mermaid
classDiagram
    class Pen {
        <<abstract>>
        -String brand
        -String name
        -PenType type
        -double price
        -WritingStrategy writingStrategy
        +write() void
        +changeRefill(Refill refill)* void
    }

    class WritingStrategy {
        <<interface>>
        +write() void
    }

    class SmoothWritingStrategy {
        +write() void
    }

    class RoughWritingStrategy {
        +write() void
    }
    
    WritingStrategy <|-- SmoothWritingStrategy
    WritingStrategy <|-- RoughWritingStrategy
    Pen "*" --o "1" WritingStrategy : has a

```

>Version 4
```mermaid
classDiagram
    class Pen {
    <<abstract>>
    -String brand
    -String name
    -PenType type
    -double price
    -WritingStrategy writingStrategy
    +write() void
}

class RefillablePen {
    <<abstract>>
    -Refill refill
    +changeRefill(Refill) void
    +getRefill() Refill
    +isRefillable() boolean
}

class NonRefillablePen {
    <<abstract>>
    -Ink ink
    -Nib nib
    +changeInk(Ink) void
}

class GelPen {
    +write() void
    +changeRefill(Refill) void
    +getRefill() Refill
    +isRefillable() boolean
}

class BallPen {
    +write() void
    +changeRefill(Refill) void
    +getRefill() Refill
    +isRefillable() boolean
}

class FountainPen {
    +write() void
}

Pen <|-- RefillablePen
Pen <|-- NonRefillablePen
RefillablePen <|-- GelPen
RefillablePen <|-- BallPen
NonRefillablePen <|-- FountainPen


```

>Version 5
```mermaid
classDiagram
    class Pen {
        <<abstract>>
        -String brand
        -String name
        -PenType type
        -double price
        -WritingStrategy writingStrategy
        +write() void
    }

    class RefillPen {
        <<interface>>
        +changeRefill(Refill) void
        +getRefill() Refill
        +isRefillable() boolean
    }

    class GelPen {
        -Refill refill
        +write() void
        +changeRefill(Refill) void
        +getRefill() Refill
        +isRefillable() boolean
    }

    class BallPen {
        -Refill refill
        +write() void
        +changeRefill(Refill) void
        +getRefill() Refill
        +isRefillable() boolean
    }

    class FountainPen {
        -Ink ink
        -Nib nib
        +write() void
    }

    Pen <|-- GelPen : extends
    Pen <|-- BallPen : extends
    Pen <|-- FountainPen : extends

    RefillPen <|-- GelPen : implements
    RefillPen <|-- BallPen : implements

```