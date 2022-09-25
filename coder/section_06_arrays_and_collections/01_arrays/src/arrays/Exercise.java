// package arrays;

import java.util.Arrays;

public class Exercise {

	public static void main ( String[] args ) {

		double[] studentGrades = new double[3];
		// double [] studentGrades = new double[3]; // works, too
		// double []studentGrades = new double[3]; // works, too
		// double studentGrades[] = new double[3]; // works, too

		System.out.println(Arrays.toString(studentGrades));

		System.out.println(studentGrades);

		studentGrades[0] = 3.8;

		studentGrades[1] = 8; // here occurs implicity conversion

		studentGrades[2] = 6.7;

		System.out.println(studentGrades);

		System.out.println(Arrays.toString(studentGrades));

		System.out.println(studentGrades[2]);

		System.out.println(studentGrades[studentGrades.length - 1]);

		// ERROR ArrayIndexOutOfBoundsExcepction
		// System.out.println(studentGrades[4]);

		// Iterate over the array

		double totalA = 0;

		for (int i = 0; i < studentGrades.length; i++)
		{
			totalA += studentGrades[i];
		}

		System.out.println(totalA / studentGrades.length);

		// The 10 is converted to double
		// We can initialize

		final double grade = 9.8;

		double[] anotherStudentGrandes = { 6.5, 7.9, grade, 10 };

		double totalB = 0;

		for (int i = 0; i < anotherStudentGrandes.length; i++ )
		{
			totalB += anotherStudentGrandes[i];
		}

		System.out.println(totalB / anotherStudentGrandes.length);
	}
}