package control;

import java.util.Scanner;

public class WhileChallenge {

	public static void main ( String[] args ) {

		int total_grades = 0;

		Double grade_sum = 0.0;

		Scanner scanner = new Scanner(System.in);

		Double grade = 0.0;

		Double mean = 0.0;

		do {

			System.out.print("grade: ");

			grade = scanner.nextDouble();

			if ( grade >= 0 && grade <= 10 )
			{
				grade_sum += grade;

				total_grades ++;
			} 
			else if ( grade != -1 )
			{
				System.out.println("Invalid grade");
			}

		}

		while ( grade != -1 );

		mean = grade_sum / total_grades;

		System.out.printf("Mean: %.2f" , mean);
	}
}