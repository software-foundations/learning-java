package classesandmethods;

public class ProductChallenge {

	String name;

	double price;

	static double discount = 0.25;

	// Two methods with same name but with different signatures

	public double priceWithDiscount() {

		return price * (1 - discount);

	}

	public double priceWithDiscount(double managerDiscount) {

		return price * (1 - discount - managerDiscount);
	}
}