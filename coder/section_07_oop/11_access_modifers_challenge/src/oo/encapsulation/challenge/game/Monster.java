package oo.encapsulation.challenge.game;

public class Monster extends Player {

	public Monster() {
		this(0, 0);
		// super(0, 0); // works, too
	}

	public Monster(int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}
	
}