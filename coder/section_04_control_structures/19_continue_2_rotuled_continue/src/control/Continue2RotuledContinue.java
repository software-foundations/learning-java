package control;

public class Continue2RotuledContinue {

	public static void main ( String[] args ) {

		// outer is a label (alias) for the for loop

		outer: for (int i = 0; i < 3; i ++) {

			inner: for (int j = 0; j < 3; j ++) {

				if (i == 1) {
					continue outer;
					// break;
				}

				System.out.printf("[%d %d] ", i, j);
			}

			System.out.println();
		}

		System.out.println("END");

	}
}