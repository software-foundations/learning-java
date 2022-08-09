package fundamentals;

import java.util.Scanner;

public class NextInt {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Age: ");

		int age = scanner.nextInt();

		// Ignores the "\n"
		scanner.nextLine();

		System.out.println("Name: ");

		String name = scanner.nextLine();

		System.out.printf("%s has %d years old\n", name, age);
	}
}