package turtleGraphics;

public class Position {

    int row = 0;
    int column = 0;

    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    Position(int row) {
        this(row, 0);
    }

    Position() {
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position p = (Position) obj;
            return p.row == row && p.column == column;
        }
        return false;
    }
}
