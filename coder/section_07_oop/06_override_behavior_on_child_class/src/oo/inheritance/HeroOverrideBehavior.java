package oo.inheritance;

public class HeroOverrideBehavior extends PlayerOverrideBehavior {

	 boolean attack(PlayerOverrideBehavior opponent) {
		 boolean attack01 = super.attack(opponent);
		 boolean attack02 = super.attack(opponent);
		 return attack01 || attack02;
    }
}