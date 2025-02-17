package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTurtle {

    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void testPenIsUpInitially() {
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void testTurtleCanLowerPen() {
        assertFalse(turtle.isPenDown());

        turtle.lowerPen();
        assertTrue(turtle.isPenDown());
    }

    @Test
    public void testTurtleCanRaisePen() {
        turtle.lowerPen();
        assertTrue(turtle.isPenDown());

        turtle.raisePen();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void testTurtleFacesEastInitially() {
        assertEquals(Direction.EAST, turtle.getDirection());
    }

    @Test
    public void testTurtleCanTurnRight() {
        assertEquals(Direction.EAST, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getDirection());
    }

    @Test
    public void testTurtleCanTurnRightMultipleTimes() {
        assertEquals(Direction.EAST, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getDirection());
    }

    @Test
    public void testTurtleCanTurnLeft() {
        assertEquals(Direction.EAST, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getDirection());
    }

    @Test
    public void testTurtleCanTurnLeftMultipleTimes() {
        assertEquals(Direction.EAST, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getDirection());
    }

    @Test
    public void testInitialPositionIs_00() {
        assertEquals(new Position(), turtle.getPosition());
    }

    @Test
    public void testTurtleCanMove() {
        turtle.moveForward(5);

        assertNotEquals(new Position(), turtle.getPosition());
    }

    @Test
    public void testTurtleCannotMoveOutOfBounds() {
        turtle.moveForward(30);

        assertEquals(new Position(), turtle.getPosition());
    }

    @Test
    public void testTurtleCanDraw() {
        turtle.lowerPen();
        assertTrue(turtle.isPenDown());

        turtle.moveForward(5);
        var testArray = new boolean[20][20];
        for (int i = 0; i < 5; i++) {
            testArray[0][i] = true;
        }
        assertArrayEquals(turtle.getSketchbook().getTiles(), testArray);
    }



}