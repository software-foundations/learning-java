package oop.composition.challenge;

public class Item {
	
	int quantity;

	Product product;

	Item(Purchase purchase, Product product, int quantity) {
		purchase.addItem(this);
		this.product = product;
		this.quantity = quantity;		
	}
}