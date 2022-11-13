package oop.composition.challenge;

import java.util.List;
import java.util.ArrayList;

public class Purchase {
		
	List<Item> items = new ArrayList<>();

	// Composition: There is no Purchase without a Client
	Purchase(Client client) {
		client.addPurchase(this);
	}

	void addItem(Item item) {
		this.items.add(item);
	}
}