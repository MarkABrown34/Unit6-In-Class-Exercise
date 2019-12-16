## Abstract Class Exercise: Tetris Pieces

This exercise involves using an abstract class and creating a number of classes which extend an
abstract class. It it intended to help students familiarize themselves with this pattern and to gain confidence
as a developer.

### Task
Your task will be to examine the abstract class `TetrisPiece` and to then create a number of subclasses
that extend from this class, which each represent a Tetris piece. This will necessarily include implementing the four abstract
methods that the abstract class contains, which are:

* `drawNorth()`
* `drawEast()`
* `drawSouth()`
* `drawWest()`

You will also need to implement the `draw()` method on the `TetrisPiece` class, which draws the piece in its 
current orientation.

A `Main` class has been created which includes a method for drawing a piece in all four implementations. As you develop
 the code for each piece you can use this method to check your work.
 
### The Pieces
The following pieces need to be implemented as subclasses that extend `TetrisPiece`:
 
#### Square
```
* *
* *
```

#### Straight
```
*
*
*
*
```

#### T
```
  * 
* * *
```

The game includes other pieces, but they are out of scope for this exercise.

