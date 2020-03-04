package model;

public class Position {
    private int positionX;
    private int positionY;

    Position(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public void setPos(int posX, int posY) {
        this.positionX = posX;
        this.positionY = posY;
    }
}
