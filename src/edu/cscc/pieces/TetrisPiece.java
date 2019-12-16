package edu.cscc.pieces;

import java.util.Objects;

import static edu.cscc.meta.Orientations.*;

/**
 * This class represents a base Tetris piece. It knows how to rotate
 * and draw the piece in its current orientation, either north, east, south, or west.
 * It includes methods to be overridden by subclasses to draw a piece in a given orientation.
 */
public abstract class TetrisPiece {

    protected String name;
    protected int orientation;

    public TetrisPiece(String name, int orientation) {
        this.name = name;
        this.orientation = orientation;
    }

    /**
     * This method checks the current orientation of the piece and updates it to the next
     * orientation in order. The order is: north -> east -> south -> west.
     *
     * Once the end of the order is reached it starts over.
     */
    public void rotate() {
        switch (orientation) {
            case NORTH:
                this.orientation = EAST;
                break;
            case EAST:
                this.orientation = SOUTH;
                break;
            case SOUTH:
                this.orientation = WEST;
                break;
            case WEST:
                this.orientation = NORTH;
                break;
        }
    }

    /**
     * TODO Implement this method in the class.
     * Draws the piece based on the current orientation. If the current orientation is
     * Orientation.NORTH then it will call drawNorth(). East is drawEast(), etc.
     *
     * This implementation writes the String representation of the piece to
     * System.out.
     */
    public void draw() {
        //TODO Implement this method.
        switch(orientation){
            case NORTH:
                System.out.println(drawNorth);
                break;
            case EAST:
                drawEast();
                break;
            case SOUTH:
                drawSouth();
                break;
            case WEST:
                drawWest();
        }
    }

    /**
     * TODO Implement this method on the subclasses.
     * Draw the northern, vertical representation of the piece.
     * @return The String representation of the piece in the north position.
     */
    protected abstract String drawNorth();

    /**
     * TODO Implement this method on the subclasses.
     * Draw the eastern, horizontal representation of the piece.
     * @return The String representation of the piece in the east position.
     */
    protected abstract String drawEast();

    /**
     * TODO Implement this method on the subclasses.
     * Draw the southern, vertical representation of the piece.
     * @return The String representation of the piece in the south position.
     */
    protected abstract String drawSouth();

    /**
     * TODO Implement this method on the subclasses.
     * Draw the western, horizontal representation of the piece.
     * @return The String representation of the piece in the west position.
     */
    protected abstract String drawWest();

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TetrisPiece that = (TetrisPiece) o;
        return orientation == that.orientation &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orientation);
    }

    @Override
    public String toString() {
        return "TetrisPiece{" +
                "name='" + name + '\'' +
                ", orientation=" + orientation +
                '}';
    }
}
