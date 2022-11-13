package oo.inheritance.challenge;

public class Car {

	double currentVelocity = 0.0;

	void accelerate() {		
		this.currentVelocity += 5.0;		
	}

	void brake() {
		double brakeDecrement = 5.0;
		if (this.currentVelocity - brakeDecrement >= 0.0) {
			this.currentVelocity -= brakeDecrement;
		}	
	}
}