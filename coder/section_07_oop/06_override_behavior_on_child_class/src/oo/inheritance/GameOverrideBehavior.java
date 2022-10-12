package oo.inheritance;

class GameOverrideBehavior {

    public static void main(String[] args) {
        MonsterOverrideBehavior monster = new MonsterOverrideBehavior();
        monster.xPosition = 10;
        monster.yPosition = 10;

        HeroOverrideBehavior hero = new HeroOverrideBehavior();
        hero.xPosition = 10;
        hero.yPosition = 11;

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