package oo.inheritance;

class Game {

    public static void main(String[] args) {
        Monster p1 = new Monster();
        p1.xPosition = 10;
        p1.yPosition = 10;

        Hero p2 = new Hero();
        p2.xPosition = 10;
        p2.yPosition = 11;

        System.out.println(p1.life);
        System.out.println(p2.life);
        p2.attack(p1);
        p1.attack(p2);
        System.out.println(p1.life);
        System.out.println(p2.life);
    }
}