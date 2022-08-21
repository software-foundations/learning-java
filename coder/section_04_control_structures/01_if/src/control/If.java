package control;

import java.util.Scanner;

public class If {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Grade: ");

		double grade = scanner.nextDouble();

		scanner.close();

		if ( grade <= 10.0 && grade >= 7.0 ) {

			System.out.println("APPROVED");
			System.out.println("CONGRATULATIONS");
		}

		if ( grade < 7 && grade >= 4.5 ) {

			System.out.println("TRY AGAIN");
		}

		boolean failureCriterion = grade < 4.5 && grade >= 0;

		if ( failureCriterion ) {

			System.out.println("NOT APPROVED");
		}


	}
}