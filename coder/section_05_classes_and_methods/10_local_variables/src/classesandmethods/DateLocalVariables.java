package classesandmethods;

public class DateLocalVariables {

	int day;

	int month;

	int year;

	DateLocalVariables() {

		this(1, 1, 1970);

	}

	DateLocalVariables (int day, int month, int year) {

		this.day = day;

		this.month = month;

		this.year = year;

	}

	public String getFormattedDate() {


		/*
		This is a local variable
		It is available in the scope where it is declared
		*/
		final String dateFormat = "%d/%d/%d";

		return String.format(
			dateFormat, this.year, this.month, this.day);
	}

	public void printFormattedDate() {

		System.out.println(this.getFormattedDate());

	}



}