package lambdas;

public class CalculusTest2 {

	public static void main(String[] args) {

		Calculus add = (x, y) -> {
			return x + y;
		};

		Calculus multiply = (x, y) -> x * y;

		System.out.println(add.execute(2, 3));
		System.out.println(multiply.execute(2, 3));
	}
}