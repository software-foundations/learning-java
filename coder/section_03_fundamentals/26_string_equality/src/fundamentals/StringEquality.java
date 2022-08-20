package fundamentals;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s = new String("2");

		System.out.println("2" == s);

		System.out.println("2".equals(s));

		Scanner scanner = new Scanner(System.in);

		// next() already remote the blank spaces
		// nextLine() does not remote the blank spaces
		String s2 = scanner.next();
		// String s2 = scanner.nextLine();

		System.out.println("2".equals(s2));

		// trim() remove blank spaces
		System.out.println("2".equals(s2.trim()));
	}
}