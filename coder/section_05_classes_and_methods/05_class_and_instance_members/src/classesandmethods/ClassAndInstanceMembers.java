package classesandmethods;

public class ClassAndInstanceMembers {

	double radius;

	// static means class member
	// static is used to constant members generally
	static final double PI = 3.14;

	ClassAndInstanceMembers (double initialRadius) {

		radius = initialRadius;

	}

	double area() {

		// power is a static method
		return PI * Math.pow(radius, 2);

	}

	// Another method with different signature
	static double area(double radius) {

		return PI * Math.pow(radius, 2);
	}
}