package classesandmethods;

public class FirstTraumaChallenge {

	int a = 10;

	static int b = 20;

	public static void main ( String[] args ) {

		// error: non-static variable a cannot be referenced
		// from a static context
		FirstTraumaChallenge firstTraumaChallenge = new FirstTraumaChallenge();

		System.out.println(firstTraumaChallenge.a);

		System.out.println(firstTraumaChallenge.b);

		System.out.println(b);

	}
}