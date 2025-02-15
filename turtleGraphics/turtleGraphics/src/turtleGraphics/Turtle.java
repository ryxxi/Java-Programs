package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private boolean isPenDown = false;
    private Direction direction = EAST;
    private Position position = new Position();
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

}

