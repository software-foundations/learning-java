package control;

import java.util.Scanner;

public class IfElseIf {

	public static void main ( String[] args ) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Grade: ");

		double grade = scanner.nextDouble();

		if ( grade > 10 || grade < 0 ) {

			System.out.println("INVALID GRADE");
		}

		else if ( grade >= 8.1 ) {

			System.out.println("A");
		}

		else if ( grade >= 6.1 ) {

			System.out.println("B");
		}

		else if ( grade >= 4.1 ) {

			System.out.println("C");
		}

		else if ( grade >= 2.1 ) {

			System.out.println("D");
		}

		else {

			System.out.println("E");
		}

		scanner.close();

	}
}