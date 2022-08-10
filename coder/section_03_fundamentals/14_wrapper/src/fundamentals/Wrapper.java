package fundamentals;

public class Wrapper {

	public static void main (String[] args) {

		Byte b = 100;

		Short s = 1000;

		Integer i = 10_000;
		// Integer i = Integer.parseInt("10000");

		Long l = 1_000_000L;

		// Boolean bol = Boolean.parseBoolean("true");
		Boolean bol = true;

		Character c = 'c';

		Float f = 123F;

		Double d = 1234.5678;

		System.out.println(b.byteValue());

		System.out.println(s.toString());

		System.out.println(i);

		System.out.println(bol.toString().toUpperCase());

		System.out.println(c + "...");

		System.out.println(c.toString().toUpperCase());

		System.out.println(f);

		System.out.println(d);
	}
}