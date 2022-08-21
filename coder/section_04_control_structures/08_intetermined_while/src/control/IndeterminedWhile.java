package control;

import java.util.Scanner;

public class IndeterminedWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = "";

		while ( ! input.equalsIgnoreCase("exit") ) {

			System.out.print("input: ");
			
			input = scanner.nextLine();
		}

		System.out.print("END");

		scanner.close();
	}
}