package fundamentals;

public class DotNotation {

	public static void main(String[] args) {		

		String s = "Goog Morning X";

		s = s.toUpperCase();

		s = s.replace("X", "Mrs");

		s = s.concat("!!!");

		System.out.println(s);

		String x = "Bruno".
			toUpperCase();

		System.out.println(x);

		String y = "Good Morning X"
			.replace("X", "Gui")
			.toUpperCase()
			.concat("!!!");

		System.out.println(y);

		// Primitive types do not have Dot Operator
	}
}