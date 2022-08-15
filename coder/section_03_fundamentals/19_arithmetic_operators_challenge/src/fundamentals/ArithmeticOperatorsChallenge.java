package fundamentals;

public class ArithmeticOperatorsChallenge {

	public static void main (String[] args) {

		double numberA = Math.pow( 6 * (3 + 2), 2);

		double denominatorA = 3 * 2;

		double numberB = (1 - 5) * (2 - 7);

		double denominatorB = 2;

		double topNumberA = numberA / numberB;

		double topNumberB = Math.pow(numberB / denominatorB, 2);

		double top = Math.pow(topNumberA - topNumberB, 3);

		double bottom = Math.pow(10, 3);

		double result = top / bottom;

		System.out.println("Result: " + result);
	}
}