package oo.encapsulation.test;
import oo.encapsulation.challenge.game.Direction;
import oo.encapsulation.challenge.game.Hero;
import oo.encapsulation.challenge.game.Monster;
import oo.encapsulation.challenge.game.Player;

class GameTest {

    public static void main(String[] args) {
        // Monster monster = new Monster(10, 10); //  works too
        Monster monster = new Monster();
        monster.xPosition = 10;
        monster.yPosition = 10;

        Hero hero = new Hero(10, 11);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life: " + hero.life);

        hero.attack(monster);
        monster.attack(hero);

        hero.attack(monster);
        monster.attack(hero);

        monster.move(Direction.NORTH);
        hero.attack(monster);
        monster.attack(hero);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life: " + hero.life);
    }
}