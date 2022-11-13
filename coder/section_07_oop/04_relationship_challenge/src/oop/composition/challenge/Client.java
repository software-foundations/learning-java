package oop.composition.challenge;

import java.util.List;
import java.util.ArrayList;

public class Client {

	String name;

	List<Purchase> purchases = new ArrayList<>();

	Client(String name) {
		this.name = name;
	}

	void addPurchase(Purchase purchase) {
		this.purchases.add(purchase);
	}

	public String toString() {
		return this.name;
	}

	double getTotalPriceOfAllPurchases() {
		double total = 0.0;
		for (Purchase purchase: this.purchases) {
			for (Item item: purchase.items) {
				total += item.quantity*item.product.price;
			}
		}

		return total;
	}
}