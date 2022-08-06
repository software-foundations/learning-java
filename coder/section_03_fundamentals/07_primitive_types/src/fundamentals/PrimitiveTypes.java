package fundamentals;

public class PrimitiveTypes {

	public static void main (String[] args) {

		// Employee informations

		/////////////////////////////
		// Integer numerical types //
		/////////////////////////////

		byte yearsOfEnterprise = 23;

		short numberOfFlights = 32677;
		// short numberOfFlights = 32678; // overflow the range of bytes

		int id = 56789;

		// we can separae using underline
		long accumulatedPoints = 3_134_845_223L;

		//////////////////////////
		// Real numerical types //
		//////////////////////////

		// If we not put F, this literal will be treated as double by default
		// It means that java will implicity put the D at the finale
		float salary = 11_445.44F;

		double accumulatedSales = 2_991_797_103.01;

		///////////////////
		// Boolean Type //
		///////////////////
		boolean isOnVacation = false;

		/////////////////////
		// Charactere Type //
		/////////////////////

		char status = 'A';

		// char type accepts things on unicode table
		char something = '\u0010';

		/////////
		// END //
		/////////

		System.out.println(yearsOfEnterprise * 365);

		System.out.println(numberOfFlights / 2);

		System.out.println(accumulatedPoints / accumulatedSales);

		System.out.println(id + ": ganha -> " + salary);

		System.out.println("Vacation ? " + isOnVacation);

		System.out.println("Status " + status);

		System.out.println("Something " + something);
	}
}