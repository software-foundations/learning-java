package oop.composition;

public class PurchaseTest {

	public static void main(String[] args) {

		Purchase p1 = new Purchase();

		p1.clientName = "Bruno";

		p1.addItem(new Item("Pen", 20, 7.45));

		p1.addItem("Pencil", 10, 2.50);

		p1.addItem(new Item("Notebook", 3, 18.90));

		System.out.println(p1.items.size());

		System.out.println(p1.getTotalValue());

		// It is only to see the bidirection relationship
		p1.items.get(0).purchase.items.get(1).purchase.getTotalValue();
	}

}