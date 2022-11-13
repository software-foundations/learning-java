package oo.inheritance;

class Player {
    int life = 100;
    int xPosition;
    int yPosition;

    boolean attack(Player opponent) {
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

    void move(Direction direction) {

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