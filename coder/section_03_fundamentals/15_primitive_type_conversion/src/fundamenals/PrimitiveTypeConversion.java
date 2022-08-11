package fundamentals;

public class PrimitiveTypeConversion {

	public static void main(String[] args) {

		double a = 1;

		// implicit conversion
		System.out.println(a);

		// Works, but the default solution is to use cast
		// float b = 1.0F;

		// explicit conversion (cast)
		// float b = (float) 1.0; // do not loose information when cast to float
		float b = (float) 1.123456789123456789; // lose information

		System.out.println(b);

		// int c = 340; // loose information when cast to int
		int c = 240;

		// explicity
		byte d = (byte) c;

		System.out.println(d);

		double e = 6.9999999;

		// explicit conversion (cast)
		int f = (int) e;

	}
}