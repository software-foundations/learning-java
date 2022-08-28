package classesandmethods;

public class DateThis {

//	They are instance attributes
	int day;

	int month;

	int year;

	DateThis() {
		// this.day = 1;
		// this.month = 1;
		// this.year = 1970;

		// We can ue this as a constructor of the class
		// Obs: we can only do it inside another constructor
		this(1, 1, 1970);
	}

	DateThis(int day, int month, int year) {
		
		/*
		This constructor cannot call the above
		because it will have a loop and the object will not be constructed
		*/
		// this()

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getFormattedDate() {

		// Works, too, because there's no name conflict
		// String formattedDate = String.format(
		// 	"%d/%d/%d", year, month, day);

		String formattedDate = String.format(
			"%d/%d/%d",this.year, this.month, this. day);

		return formattedDate;
	}

	public void printFormattedDate() {
		System.out.println(this.getFormattedDate());

		// works, too, because there's no name conflict
		// Sytem.out.println(getFormattedDate());
	}
}