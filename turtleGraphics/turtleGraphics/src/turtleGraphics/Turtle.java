package turtleGraphics;

import java.util.HashMap;

import static turtleGraphics.Direction.*;

public class Turtle {

    private boolean isPenDown = false;
    private Direction direction = EAST;
    private Position position = new Position();
    private HashMap<String,Sketchbook> sketchbooks;
    private Sketchbook currentSketchbook;

    public Turtle() {
        sketchbooks = new HashMap<>();
        var testSketchbook = new Sketchbook();
        sketchbooks.put("Test Sketchbook", testSketchbook);
        currentSketchbook = testSketchbook;
    }

    public void createSketchbook(String sketchbookName) {
        var newSketchbook = new Sketchbook();
        sketchbooks.put(sketchbookName, newSketchbook);
    }

    public void openSketchbook(String sketchbookName) {
        currentSketchbook = sketchbooks.get(sketchbookName);
    }

    public boolean isPenDown() {
        return isPenDown;
    }

    public void lowerPen() {
        isPenDown = true;
    }

    public void raisePen() {
        isPenDown = false;
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int steps) {
        if (isInBounds(steps)) {
            if (isPenDown) updateSketchbook(steps);
            position = direction.moveForward(position, steps);
        }

    }

    private boolean isInBounds(int steps) {
        Position temp = direction.moveForward(position, steps);
        var tiles = currentSketchbook.getTiles();
        boolean isAboveZero = temp.row >= 0 && temp.column >= 0;
        boolean isBelowUpperLimit = temp.row <= tiles.length && temp.column <= tiles[0].length;

        return isAboveZero && isBelowUpperLimit;
    }

    public Sketchbook getSketchbook() {
        return currentSketchbook;
    }

    private void updateSketchbook(int steps) {
        currentSketchbook = direction.draw(position, steps, currentSketchbook);
    }
}

