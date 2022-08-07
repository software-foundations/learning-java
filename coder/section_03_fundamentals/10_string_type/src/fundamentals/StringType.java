package fundamentals;

public class StringType {

	public static void main( String[] args ) {

		System.out.println("Hello guys".charAt(0));

		String s = "Good afternoon";

		System.out.println(s.concat("!!!"));

		System.out.println(s + "!!!");

		System.out.println(s.startsWith("Good"));

		System.out.println(s.toLowerCase().startsWith("Good"));

		System.out.println(s.length());

		System.out.println(s.endsWith("noon"));

		System.out.println(s.toUpperCase().endsWith("NOON"));

		System.out.println(s.equals("Good afternoon"));

		System.out.println(s.equalsIgnoreCase("GOOD afterNooN"));

		var name = "Bruno";

		var lastName = "Conde";

		var age = 33;

		var salary = 12345.987;

		System.out.println(
			"Name: "+ name + 
			"\nLast name: " + lastName + 
			"\nAge: " + age + 
			"\nSalary: "+ salary + "\n\n");

		System.out.printf(
			"The Mrs. %s has %d years old and gets %.2f of salary\n",
			name, age, salary);

		String sentence = String.format(
			"The Mrs. %s has %d years old and gets %.2f of salary",
			name, age, salary);

		System.out.println(sentence);

		System.out.println(sentence.contains("get"));

		System.out.println(sentence.indexOf("The"));

		System.out.println("My house".substring(3));

		System.out.println("My house".substring(3, 4));
	}}