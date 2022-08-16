package fundamentals.operators.logical.challenge;

public class LogicalOperatorsChallenge {

	public static void main (String[] args) {

		boolean job1 = false;

		boolean job2 = false;

		if ( job1 ^ job2 ) {

			System.out.println("TV 32");
		}

		if ( job1 && job2 ) {

			System.out.println("TV 50");
		}

		if ( job1 || job2 ) {

			System.out.println("Ice cream");
		}

		else {

			System.out.println("Stay home");
		}

	}
}