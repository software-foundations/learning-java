package fundamentals;

public class CircumferenceArea {

	public static void main(String[] args) {

		// constant (UPPER CASE)
		final double PI = 3.14159;		

		double radius = 3;

		double area = PI * radius * radius;

		System.out.println("Area = " + area + " m2");

		radius = 6;

		area = PI * radius * radius;

		System.out.println("Area = " + area + " m2");
	}
}