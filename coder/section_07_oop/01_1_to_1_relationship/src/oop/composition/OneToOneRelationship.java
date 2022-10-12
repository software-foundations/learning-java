package oop.composition;

public class OneToOneRelationship {

	public static void main(String[] args1) {

		Car car1 = new Car();
		System.out.println(car1.isTurnedOn());

		car1.turnOn();
		System.out.println(car1.isTurnedOn());

		System.out.println(car1.motor.spins());

		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();

		System.out.println(car1.motor.spins());

		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();

		// Needs encapsulation
		// car1.motor.injectionFactor = -30;

		System.out.println(car1.motor.spins());
	}
}