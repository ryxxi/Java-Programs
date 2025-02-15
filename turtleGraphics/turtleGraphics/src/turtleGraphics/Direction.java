package turtleGraphics;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    private static final Direction[] VALUES = values();

    public Direction turnRight() {
        return VALUES[(this.ordinal() + 1) % VALUES.length];
    }

    public Direction turnLeft() {
        return VALUES[(this.ordinal() - 1 + VALUES.length) % VALUES.length];
    }
}
