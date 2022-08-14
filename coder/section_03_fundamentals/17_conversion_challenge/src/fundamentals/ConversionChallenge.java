package fundamentals;

import java.util.Scanner;

public class ConversionChallenge {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("string1: ");
		String string1 = scanner.nextLine().replace(',', '.');

		System.out.print("string2: ");
		String string2 = scanner.nextLine().replace(',', '.');

		System.out.print("string3: ");
		String string3 = scanner.nextLine().replace(',', '.');

		// It is a good practice to close the scanner
		scanner.close();

		double number1 = Double.parseDouble(string1);
		double number2 = Double.parseDouble(string2);
		double number3 = Double.parseDouble(string3);

		double sum = number1 + number2 + number3;

		double mean = sum / 3;

		System.out.println("Sum: " + sum);

		System.out.println("Mean: " + mean);
	}
}