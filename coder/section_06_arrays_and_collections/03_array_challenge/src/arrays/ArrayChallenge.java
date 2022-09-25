package arrays;

import java.util.Scanner;

public class ArrayChallenge {

	public static void main ( String[] args ) {

		Scanner scanner = new Scanner(System.in);

		int numberOfGrades = 0;
		System.out.println("Number of grades: ");
		numberOfGrades = scanner.nextInt();

		double[] grades = new double[numberOfGrades];
		for(int i = 0; i < grades.length; i ++) {
			System.out.println("Grade: ");
			grades[i] = scanner.nextDouble();
		}

		double sumGrades = 0;
		for(double grade: grades) {
			sumGrades += grade;
		}
		double meanGrade = sumGrades / grades.length;
		System.out.println("Mean grade: " + meanGrade);

	}
}