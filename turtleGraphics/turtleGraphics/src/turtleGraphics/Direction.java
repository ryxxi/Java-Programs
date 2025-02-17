package turtleGraphics;

public enum Direction {
    NORTH {
        @Override
        Position moveForward(Position position, int steps) {
            return new Position(position.row - steps, position.column);
        }

        @Override
        Sketchbook draw(Position position, int steps, Sketchbook sketchbook) {
            var tiles = sketchbook.getTiles();
            var row = position.row;
            var column = position.column;

            for (int i = 0; i < steps; i++) {
                tiles[row][column] = true;
                row--;
            }
            return sketchbook;
        }
    },

    EAST {
        @Override
        Position moveForward(Position position, int steps) {
            return new Position(position.row, position.column + steps);
        }

        @Override
        Sketchbook draw(Position position, int steps, Sketchbook sketchbook) {
            var tiles = sketchbook.getTiles();
            var row = position.row;
            var column = position.column;

            for (int i = 0; i < steps; i++) {
                tiles[row][column] = true;
                column++;
            }
            return sketchbook;
        }
    },

    SOUTH {
        @Override
        Position moveForward(Position position, int steps) {
            return new Position(position.row + steps, position.column);
        }

        @Override
        Sketchbook draw(Position position, int steps, Sketchbook sketchbook) {
            var tiles = sketchbook.getTiles();
            var row = position.row;
            var column = position.column;

            for (int i = 0; i < steps; i++) {
                tiles[row][column] = true;
                row++;
            }
            return sketchbook;
        }
    },

    WEST {
        @Override
        Position moveForward(Position position, int steps) {
            return new Position(position.row, position.column - steps);
        }

        @Override
        Sketchbook draw(Position position, int steps, Sketchbook sketchbook) {
            var tiles = sketchbook.getTiles();
            var row = position.row;
            var column = position.column;

            for (int i = 0; i < steps; i++) {
                tiles[row][column] = true;
                column--;
            }
            return sketchbook;
        }
    };

    private static final Direction[] VALUES = values();

    public Direction turnRight() {
        return VALUES[(this.ordinal() + 1) % VALUES.length];
    }

    public Direction turnLeft() {
        return VALUES[(this.ordinal() - 1 + VALUES.length) % VALUES.length];
    }

    abstract Position moveForward(Position position, int steps);
    abstract Sketchbook draw(Position position, int steps, Sketchbook sketchbook);
}
