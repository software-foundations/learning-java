package control;

import java.util.Scanner;

public class DoWhile {

	public static void main( String[] args ) {

		String input = "";

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.print("input: ");

			input = scanner.nextLine();

		} while ( !input.equalsIgnoreCase("exit") );

		scanner.close();
	}
}