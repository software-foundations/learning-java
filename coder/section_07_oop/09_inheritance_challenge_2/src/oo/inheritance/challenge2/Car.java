package oo.inheritance.challenge2;

public class Car {

	final int MAX_VELOCITY;
	int currentVelocity = 0;
	int velocityIncrement = 5;

	Car(int maxVelocity) {
		this.MAX_VELOCITY = maxVelocity;
	}
	void accelerate() {		
		if (this.currentVelocity + this.velocityIncrement > this.MAX_VELOCITY) {
			this.currentVelocity = this.MAX_VELOCITY;
		} else {
			this.currentVelocity += velocityIncrement;
		}

	}

	void brake() {
		int brakeDecrement = 5;
		if (this.currentVelocity - brakeDecrement >= 0) {
			this.currentVelocity -= brakeDecrement;
		}
	}
}