package classesandmethods;

public class Product {

	String name;

	double price;

	double discount;

	// Two methods with same name but with different signatures

	public double priceWithDiscount() {

		return price * (1 - discount);

	}

	public double priceWithDiscount(double managerDiscount) {

		return price * (1 - discount - managerDiscount);
	}
}