package oo.inheritance.challenge2;

public class Ferrari extends Car {

	Ferrari() {
		this(300);
	}

	Ferrari(int maxVelocity) {
		super(maxVelocity);
		this.velocityIncrement = 15;
	}
	
}