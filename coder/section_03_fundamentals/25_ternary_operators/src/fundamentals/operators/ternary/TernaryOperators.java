package fundamentals.operators.ternary;

public class TernaryOperators {

	public static void main(String[] args) {

		double mean = 5.6;

		String partialResult = mean >= 5 ? "APPROVED" : "NOT APPROVED";

		String finalResult = mean >= 7.0 ? "APPROVED" : partialResult;

		System.out.println("The student is " + finalResult);

		double grade = 7.3;

		boolean goodBehavior = true;

		boolean approvedByGrade = grade > 7;

		boolean hasDiscount = goodBehavior && approvedByGrade;

		String result = hasDiscount ? "YES." : "NO.";

		System.out.printf("Has discount ? %s", result);
	}
}