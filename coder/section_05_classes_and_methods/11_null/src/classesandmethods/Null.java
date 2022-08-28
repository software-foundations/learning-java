package classesandmethods;

public class Null {

	public static void main ( String[] args ) {

		// It is an empty String
		String s1 = "";

		System.out.println(s1.concat("!!!"));

		// This will raise a compilation error
		/*String s2;

		System.out.println(s2.concat("!!!"));*/

		// This will raise a runtime error
		// It is the famous NullPointerException
		/*
		String s3 = null;

		System.out.println(s3.concat("!!!"));
		*/

		// Remember that a default value of an object is null
		// So, we can assign null to an object
		// Here, the null pointer exception is a possibility
		// Then, we can check if the variable is null before continue the code

		
		DateNull date = Math.random() > 0.5 ? new DateNull() : null;

		if ( date != null )
		{
			date.month = 3;
			
			System.out.println(date.getFormattedDate());
		}
		
	}
}