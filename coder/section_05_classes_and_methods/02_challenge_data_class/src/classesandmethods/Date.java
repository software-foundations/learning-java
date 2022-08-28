package classesandmethods;

public class Date {

//	They are instance attributes
	Integer day;

	Integer month;

	Integer year;

	public String getFormattedDate() {

		String formattedDate = String.format("%d/%d/%d",year, month, day);

		return formattedDate;
	}
}