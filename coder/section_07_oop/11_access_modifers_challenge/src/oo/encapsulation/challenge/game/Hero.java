package oo.encapsulation.challenge.game;

public class Hero extends Player {

	public Hero (int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}

	@Override
	public boolean attack(Player opponent) {
		 boolean attack01 = super.attack(opponent);
		 boolean attack02 = super.attack(opponent);
		 return attack01 || attack02;
    }
}