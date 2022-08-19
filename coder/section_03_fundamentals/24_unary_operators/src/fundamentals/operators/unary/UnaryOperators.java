package fundamentals.operators.unary;

public class UnaryOperators {

	public static void main (String[] args) {

		int a = 1;

		int b = a;

		a++;
		a--;

		++a;
		--a;

		System.out.println(a);
		System.out.println(b);
		
		// Avoid this kind of confusing code
		System.out.println(++a == b--);

	}
}