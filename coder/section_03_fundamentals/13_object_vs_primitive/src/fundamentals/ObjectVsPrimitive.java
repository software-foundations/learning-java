package fundamentals;

public class ObjectVsPrimitive {

	public static void main (String[] args) {

		String s = "text";

		String t = new String("text");

		s = s.toUpperCase();

		t = t.toUpperCase();

		System.out.printf("%s %s\n", s, t);

		// Wrapper
		int a = 10;

		System.out.println(a);

	}
}