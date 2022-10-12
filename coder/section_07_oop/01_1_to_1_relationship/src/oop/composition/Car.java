package oop.composition;

public class Car {

	final Motor motor; // Use final makes it secure

	Car () {
		// It allows to force construct a car creating a motor
		// And pass the car referente to the Motor constructor
		// It allow some strange things, like this.motor.car.motor.car.motor.spins
		// It is a bidirecional relationship

		// But, by default, it is simple to keep consistence between objects
		// using unidiretional relationship
		this.motor = new Motor(this);
	}

	void accelerate() {
		if (motor.injectionFactor < 2.6) {
			motor.injectionFactor += 0.4;
		}
	}

	void brake() {
		if (motor.injectionFactor > 0.5) {
			motor.injectionFactor -= 0.4;		
		}
	}

	void turnOn() {
		motor.isOn = true;
	}

	void turnOff() {
		motor.isOn = false;
	}

	boolean isTurnedOn() {
		return motor.isOn;
	}
}