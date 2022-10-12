package oop.composition;

public class Motor {

	final Car car; // Use final makes it secure
	boolean isOn = false;
	double injectionFactor = 1;

	Motor(Car car) {
		this.car = car;
	}

	// spins means number of rotations
	int spins() {
		if(!this.isOn){
			return 0;
		} else {
			return (int) Math.round(injectionFactor * 3000);
		}
	}

}