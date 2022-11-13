package oo.encapsulation.challenge.game;

public class Player {
    public int life = 100;
    public int xPosition;
    public int yPosition;

    // procted is visible by inheritance even in a different package
    // The child classes (Monster and Hero) must have public constructor
    protected Player(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    // overrides the mother class attack method
    public boolean attack(Player opponent) {
        int deltaX = Math.abs(this.xPosition - opponent.xPosition);
        int deltaY = Math.abs(this.yPosition - opponent.yPosition);
        if (deltaX == 0 && deltaY == 1) {
            opponent.life -= 10;
            return true;
        }
        else if (deltaX == 1 && deltaY == 0) {
            opponent.life -= 10;
            return true;
        }
        else {
            return false;
        }
    }

    public void move(Direction direction) {

        switch (direction) {
            case NORTH:
                this.yPosition++;
                break;
            case SOUTH:
                this.yPosition--;
                break;
            case EAST:
                this.xPosition++;
                break;
            case WEST:
                this.xPosition--;
        }
    }
}