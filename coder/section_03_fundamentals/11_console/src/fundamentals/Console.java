// package fundamentals;

import java.util.Scanner;

public class Console {

	public static void main (String[] args) {

		System.out.print("Good");

		System.out.print(" morning!\n\n");

		System.out.println("Good");

		System.out.println(" Morning\n");

		System.out.printf("Award: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salary: %.1f%n", 1234.5678);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entry with your name: ");

		String name = scanner.nextLine();

		System.out.print("Entry with your last name: ");

		String lastName = scanner.nextLine();

		System.out.print("Entry with your age: ");

		int age = scanner.nextInt();

		System.out.printf(
			"%s %s has %d years old%n", name, lastName, age);

		scanner.close();
	}
}