package fundamentals;

/**
 * This class cast the temperature from °F to °C
 * 
 * @author Bruno Conde <brunoconde.ufpa@email.com>
*/
public class Temperature {

	public static void main (String[] args) {

		final double FACTOR = 5.0/9.0;

		final double ADJUSTMENT = 32;

		double fahrenheit = 86;

		double celcius = (fahrenheit - ADJUSTMENT) * FACTOR;

		System.out.println(celcius + " °C");

		fahrenheit = 150;

		celcius = (fahrenheit - ADJUSTMENT) * FACTOR;

		System.out.println(celcius + " °C");
	}
}