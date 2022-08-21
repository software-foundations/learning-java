package fundamentals.challenge;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Number 1:");

		double number1 = scanner.nextDouble();

		System.out.println("Number 2:");

		double number2 = scanner.nextDouble();

		System.out.println("Operator: ");

		String operator = scanner.next();		

		double result = 0;

		if (operator.equals("+")) {

			result = number1 + number2;
		}

		else if (operator.equals("-")) {

			result = number1 - number2;
		}

		else if (operator.equals("*")) {

			result = number1 * number2;
		}

		else if (operator.equals("/")) {

			result = number1 / number2;
		}

		else if (operator.equals("%")) {

			result = number1 % number2;
		}

		else {

			System.out.println("Invalid operator");
		}

		System.out.println("RESULT: " + result);
	}
}