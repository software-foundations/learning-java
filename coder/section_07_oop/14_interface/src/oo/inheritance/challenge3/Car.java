package oo.inheritance.challenge3;

public class Car {

	final int MAX_VELOCITY;
	int currentVelocity = 0;
	int velocityIncrement = 5;

	Car(int maxVelocity) {
		this.MAX_VELOCITY = maxVelocity;
	}
	public void accelerate() {
		if (this.currentVelocity + this.getVelocityIncrement() > this.MAX_VELOCITY) {
			this.currentVelocity = this.MAX_VELOCITY;
		} else {
			this.currentVelocity += this.getVelocityIncrement();
		}

	}

	public void brake() {
		int brakeDecrement = 5;
		if (this.currentVelocity - brakeDecrement >= 0) {
			this.currentVelocity -= brakeDecrement;
		}
	}

	public int getVelocityIncrement() {
		return this.currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

}