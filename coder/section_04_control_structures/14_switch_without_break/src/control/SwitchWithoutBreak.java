package control;

public class SwitchWithoutBreak {

	public static void main(String[] args) {

		String karateBelt = "black";

		switch(karateBelt.toLowerCase()) {

			case "black":
				System.out.println("I know the Bassai-Dai");

			case "brown":
				System.out.println("I know the Tekki Shodan");

			case "purple":
				System.out.println("I know the Godan");

			case "blue":
				System.out.println("I know the Yodan");

			case "green":
				System.out.println("I know the Sandan");

			case "red":
				System.out.println("I know the Heian");

			case "yellow":
				System.out.println("I know the Heian Shodan");
				break;

			default:
				System.out.println("I am learning");
		}

		System.out.println("END");

		int age = 3;

		switch ( age ) {

			case 3:
				System.out.println("Can to program");

			case 2:
				System.out.println("Can speak");

			case 1:
				System.out.println("Can walk");

			case 0:
				System.out.println("Can breath");

		}
	}
}