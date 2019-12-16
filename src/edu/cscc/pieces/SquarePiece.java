package edu.cscc.pieces;

public class SquarePiece extends TetrisPiece {

    @Override
    protected String drawNorth() {return drawSquare();}

    public String drawSquare(){
        StringBuilder stringBuilder = new String();
        stringBuilder.append("* *\n");
        stringBuilder.append("* *\n");
        return null;
    }

    @Override
    protected String drawEast() {
        return null;
    }

    @Override
    protected String drawSouth() {
        return null;
    }

    @Override
    protected String drawWest() {
        return null;
    }
}
