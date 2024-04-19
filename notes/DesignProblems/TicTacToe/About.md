## Step 1: Requirement Gathering

>Do we know the system:
- Yes
- No

Get sync with the interviewer.

> Identify the system

Types of system:
- Entity
- Real life system
- Real time/Interactive Game
- Engineering Problem

>Requirements
- We should support n*n board.
- n-1 players  can play at a time.
- Before any game starts, player chooses their symbol. Symbol can be alphanumeric character.
- Randomize the list of players before game starts.
- Winning conditions: row,col,diagonal,all the four corners.
- A game ends when 1 of the player wins or if there are no moves left,which means draw.
- Do we support undo feature : Y
- Are games timed: N
- Player profile: N
- Re-watch/ Replay the game: Y
- Do we support Bots: Y
- Level of Bots: EASY,MEDIUM,DIFFICULT

> Important requirements in game system.
- Board Size
- Number of players
- How game starts
- How game ends
- Player profile
- Tournament / Matches
- Undo
- Re-watch
- Bots

```
Note: Try to cover core features + 2-3 additional features in a design interview.
```

## Step 2: Clarify Requirements
- How is undo going to work?Will there be infinite number of undo(s). Per game per player: 2 undo(s) allowed.
- How many bots per game? 0/1
- Bots cannot undo, only humans can.

## Step 3: Use case Diagram
![](D:\lld\notes\DesignProblems\TicTacToe\diagram.png)
## Step 4: Class Diagram

We wil figure out the nouns from our requirements and make class out of those.
Nouns:
- Board
- Player
- Game
- Symbol
- Bot


```mermaid


classDiagram

class Board{
Cell[][] cell
}
class Cell{
int row
int col
CellStatus cellStatus
}
class CellStatus{
    <<enumeration>>
OCCUPIED,
UNOCCUPIED
}

class Symbol{
    char s
}
class Player{
    String name
    Symbol s
}

class Bot{
    String name
    Symbol s
    BotLevel level
}

class BotLevel{
    <<enumeration>>
    EASY,
    MEDIUM,
    DIFFICULT
}

```
```mermaid
classDiagram
    class Player{
        <<abstract>>
        String name
        Symbol s
    }
Player <|-- HumanPlayer
Player <|-- Bot

class HumanPlayer{
    undo()
}
class Bot{
    BotLevel level
}

class Game{
    Board board
    int noOfPlayer
    List<Player> players
    int noOfBot
    GameStatus gameStatus
    int currentPlayerIndex
    List<Move> moves
}

class GameStatus{
    <<enumertaion>>
    IN_PROGRESS
    ENDED
    DRAWN
}

class Move{
    Player player
    Cell cell
}

%% Design Patterns
class WinningStrategy{
    <<interface>>
}
WinningStrategy <|-- DiagonalStrategy
WinningStrategy <|-- RowStrategy
WinningStrategy <|-- ColumnStrategy
WinningStrategy <|-- CornerStrategy

    class BotPlayingStrategy{
        <<interface>>
        makeMove()
    }
    BotPlayingStrategy <|-- EasyBotPlayingStrategy
    BotPlayingStrategy <|-- MediumPlayingStrategy
    BotPlayingStrategy <|-- DifficultPlayingStrategy
```
