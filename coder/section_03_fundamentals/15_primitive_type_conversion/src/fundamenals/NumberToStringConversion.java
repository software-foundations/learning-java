package fundamentals;

public class NumberToStringConversion {

	public static void main( String[] args ) {

		// Long and Double have the same behavior of Integer
		Integer num1 = 10000;

		System.out.println(num1.toString().length());

		Integer num2 = 100000;

		System.out.println(Integer.toString(num2).length());

		// works the same, but it is incommon
		System.out.println(("" + num1).toString().length());

		System.out.println(("" + num2).toString().length());

	}
}