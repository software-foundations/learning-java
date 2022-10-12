package oo.encapsulation.test;
import oo.encapsulation.challenge.vehicle.Car;
import oo.encapsulation.challenge.vehicle.Civic;
import oo.encapsulation.challenge.vehicle.Ferrari;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car civic = new Civic();
		Car ferrari = new Ferrari();

		civic.accelerate();
		ferrari.accelerate();

		System.out.println("Civic velocity: " + civic.currentVelocity);
		System.out.println("Ferrari velocity: " + ferrari.currentVelocity);

		civic.brake();
		civic.brake();
		ferrari.brake();

		System.out.println("Civic velocity: " + civic.currentVelocity);
		System.out.println("Ferrari velocity: " + ferrari.currentVelocity);

	}
}