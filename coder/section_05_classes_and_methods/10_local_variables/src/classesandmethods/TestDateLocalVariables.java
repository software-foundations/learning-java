package classesandmethods;

public class TestDateLocalVariables {

	public static void main ( String[] args ) {

		DateLocalVariables date = new DateLocalVariables();

		System.out.println(date.day);
		System.out.println(date.month);
		System.out.println(date.year);
		System.out.println(date.getFormattedDate());

		DateLocalVariables anotherDate = new DateLocalVariables(
			2, 2, 2);

		System.out.println(anotherDate.day);
		System.out.println(anotherDate.month);
		System.out.println(anotherDate.year);
		System.out.println(anotherDate.getFormattedDate());

	}

}