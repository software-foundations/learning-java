package oo.encapsulation.challenge.vehicle;

public class Car {

	// Will not be a problem a constant be public
	public final int MAX_VELOCITY;
	
	public int currentVelocity = 0;

	int velocityIncrement = 5;

	// We can, but is not necessary turns Car constructor public
	// Because only Civic and Ferrari construtctors are used outside the package
	// And only Civic and Ferrari constructors access the Car constructor
	// And they live at the same package

	// We can use procted to be visible only by inheritance
	protected Car(int maxVelocity) {
		this.MAX_VELOCITY = maxVelocity;
	}

	public void accelerate() {		
		if (this.currentVelocity + this.velocityIncrement > this.MAX_VELOCITY) {
			this.currentVelocity = this.MAX_VELOCITY;
		} else {
			this.currentVelocity += velocityIncrement;
		}

	}

	public void brake() {
		int brakeDecrement = 5;
		if (this.currentVelocity - brakeDecrement >= 0) {
			this.currentVelocity -= brakeDecrement;
		}
	}
}