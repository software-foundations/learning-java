package classesandmethods;

public class AssignmentByValueVsReference {

	public static void main ( String[] args ) {

		double a = 2;

		// assignment by value (primitive type)

		double b = a;

		a++;

		b--;

		System.out.println(a);

		System.out.println(b);

		DateImpl d1 = new DateImpl(1, 1, 2022);

		// assignment by reference (object)

		DateImpl d2 = d1;

		d1.day = 31;

		d2.month = 12;

		d1.year = 2025;

		System.out.println(d1.getFormattedDate());
		
		System.out.println(d2.getFormattedDate());

		// here, the d1 object is passed as a reference
		resetDataToDefaultValue(d1);

		System.out.println(d1.getFormattedDate());

		System.out.println(d2.getFormattedDate());

		int c = 10;

		// here, the c primitive is passed by value
		alterPrimitive(c);

		System.out.println(c);
	}

	static void alterPrimitive(int a) {
		a++;
	}

	static void resetDataToDefaultValue(DateImpl d) {

		d.day = 1;

		d.month = 1;

		d.year = 1970;
	}
}