package classesandmethods;

public class TestConstructorChallenge {

	public static void main ( String[] args ) {

		Date date = new Date();

		System.out.println(date.day);
		System.out.println(date.month);
		System.out.println(date.year);

		Date anotherDate = new Date(2, 2, 2);

		System.out.println(anotherDate.day);
		System.out.println(anotherDate.month);
		System.out.println(anotherDate.year);
	}
}