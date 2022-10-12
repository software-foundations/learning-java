package oo.inheritance.constructorsandinheritance;

public class Hero extends Player {

	Hero (int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}

	 boolean attack(Player opponent) {
		 boolean attack01 = super.attack(opponent);
		 boolean attack02 = super.attack(opponent);
		 return attack01 || attack02;
    }
}