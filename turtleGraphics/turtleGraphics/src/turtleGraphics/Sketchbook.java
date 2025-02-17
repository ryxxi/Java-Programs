package turtleGraphics;

public class Sketchbook {

    private boolean[][] tiles;

    public Sketchbook(int length, int width) {
        tiles = new boolean[length][width];
    }

    public Sketchbook(int length) {
        this(length, 20);
    }

    public Sketchbook() {
        this(20, 20);
    }


    public boolean[][] getTiles() {
        return tiles;
    }
}
