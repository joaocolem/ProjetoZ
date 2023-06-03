package src.Controller;

public class Portal {
    private int x;
    private int y;
    private int destX;
    private int destY;
    private int destinationWorld;

    public Portal(int x, int y, int destX, int destY, int destinationWorld) {
        this.x = x;
        this.y = y;
        this.destX = destX;
        this.destY = destY;
        this.destinationWorld = destinationWorld;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDestinationX() {
        return destX;
    }

    public int getDestinationY() {
        return destY;
    }

    public int getDestinationWorld() {
        return destinationWorld;
    }
}