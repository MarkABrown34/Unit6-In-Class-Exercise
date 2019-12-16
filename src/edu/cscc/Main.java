package edu.cscc;

import edu.cscc.meta.Orientations;
import edu.cscc.pieces.*;

public class Main {

    public static void main(String[] args) {
        //TODO Call drawPositions() for each subclass of TetrisPiece you create.
        SquarePiece squarePiece = new SquarePiece("square", Orientations.NORTH);
        return
    }

    /**
     * Draws a piece in each of its orientations.
     * @param tetrisPiece
     */
    private static void drawPositions(TetrisPiece tetrisPiece) {
        System.out.println("Piece name: " + tetrisPiece.getName());
        for (int i=0; i<4; i++) {
            tetrisPiece.draw();
            tetrisPiece.rotate();
        }
    }
}
