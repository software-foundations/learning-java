package lambdas;

public class CalculusTest {

	public static void main(String[] args) {

		Calculus add = new Add();
		Calculus multiply = new Multiply();

		System.out.println(add.execute(2, 3));
		System.out.println(multiply.execute(2, 3));

	}
}