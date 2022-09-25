package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixChallenge {

	public static void main( String[] args ) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of students: ");
		int numberOfStudents = scanner.nextInt();
		System.out.println("Number of grades per students: ");
		int numberOfGrades = scanner.nextInt();

		double[][] classGrades = new double[numberOfStudents][numberOfGrades];
		double sumGrades = 0;
		
		for (int s = 0; s < classGrades.length; s ++) {
			for (int g = 0; g < classGrades[s].length; g ++) {
				System.out.printf("Grade %d of the student %d: ", g + 1, s + 1);
				classGrades[s][g] = scanner.nextDouble();
				sumGrades += classGrades[s][g];
			}
		}
		scanner.close();
		double meanGrade = sumGrades / (numberOfStudents*numberOfGrades);

		System.out.printf("Mean of grades: %.2f\n\n", meanGrade);

		for (double[] studentGrades: classGrades) {			
			System.out.println(Arrays.toString(studentGrades));
		}
	}
}