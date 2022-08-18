package fundamentals.operators.relational;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 97;

		// Integer from char unicode table
		int b = 'a';

		System.out.println(a == b);

		// slash u<some_hex_number_in_unicode_table>
		// a
		System.out.println('\u0061');
		System.out.println('\u0097');

		System.out.println(3 > 4);

		System.out.println(3 >= 3);

		System.out.println(3 < 7);

		System.out.println(30 <= 7);

		System.out.println(30 != 7);

		double grade = 7.3;

		boolean goodBehavior = true;

		boolean approvedByGrade = grade > 7;

		boolean hasDiscount = goodBehavior && approvedByGrade;

		System.out.println("Has discount ? " + hasDiscount);
	}
}