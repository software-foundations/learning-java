package classesandmethods;

public class ProductWithConstructor {

	String name;

	double price;

	double discount;

	ProductWithConstructor() {
		
	}

	ProductWithConstructor(String initialName) {
		name = initialName;
	}

	ProductWithConstructor(
		String initialName,
		double initialPrice,
		double initialDiscount) {

		name = initialName;
		price = initialPrice;
		discount = initialDiscount;
	}

	// Two methods with same name but with different signatures

	public double priceWithDiscount() {

		return price * (1 - discount);

	}

	public double priceWithDiscount(double managerDiscount) {

		return price * (1 - discount - managerDiscount);
	}
}