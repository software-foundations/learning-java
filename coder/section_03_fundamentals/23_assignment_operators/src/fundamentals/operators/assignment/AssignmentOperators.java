package fundamentals.operators.assignment;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;

		c += b;
		c -= a;
		c *= b;
		c /= a;
		c %= 2; // c = c % 2
		c ++;
	}
}