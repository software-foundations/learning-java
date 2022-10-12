package oo.inheritance.constructorsandinheritance;

public class Monster extends Player {

	Monster() {
		this(0, 0);
		// super(0, 0); // works, too
	}

	Monster(int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}
	
}