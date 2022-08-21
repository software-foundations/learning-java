package control;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main (String [] args) {

		String value = JOptionPane.showInputDialog("Number: ");

		int number = Integer.parseInt(value);

		if ( number % 2 == 0 ) {

			System.out.println("Even number");
		}

		else {

			System.out.println("Odd number");
		}
	}
}