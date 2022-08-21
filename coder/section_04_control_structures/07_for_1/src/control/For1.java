package control;

public class For1 {

	public static void main (String[] args) {

		// most common use
		for (int counter = 0; counter <= 10; counter ++) {

			System.out.printf("i = %d\n", counter);

		}

		int x = 2;

		for (; x <= 10;) {

			System.out.println("x = " + x);
			x ++;
		}

		// infity loop
		for (;true;) {

			System.out.println("Always true");

			break;
		}
	}
}	