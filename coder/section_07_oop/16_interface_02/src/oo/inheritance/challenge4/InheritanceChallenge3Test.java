package oo.inheritance.challenge4;

public class InheritanceChallenge3Test {

	public static void main(String[] args) {
		
		Car civic = new Civic();
		Ferrari ferrari = new Ferrari();

		ferrari.turnOnTurbo();
		ferrari.turnOnRefrigeration();

		civic.accelerate();
		ferrari.accelerate();

		System.out.println("Civic velocity: " + civic.currentVelocity);
		System.out.println("Ferrari velocity: " + ferrari.currentVelocity);

		civic.brake();
		civic.brake();
		ferrari.brake();

		System.out.println("Civic velocity: " + civic.currentVelocity);
		System.out.println("Ferrari velocity: " + ferrari.currentVelocity);

		System.out.println("Default refrigerator speed: " + ferrari.refrigeratorSpeed());

	}
}