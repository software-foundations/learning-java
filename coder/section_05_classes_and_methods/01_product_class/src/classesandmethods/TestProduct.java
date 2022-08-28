package classesandmethods;

import java.util.Scanner;

public class TestProduct {

	public static void main (String[] args) {

		Product p1 = new Product();

		p1.name = "Notebook";

		p1.price = 4356.89;

		p1.discount = 0.25;

		// var takes dynamically the type of class
		var p2 = new Product();

		p2.name = "Black pen";

		p2.price = 12.56;

		p2.discount = 0.29;

		System.out.println(p1.name);

		System.out.println(p2.name);

		double finalPrice1 = p1.priceWithDiscount(0);

		double finalPrice2 = p2.priceWithDiscount(0.10);

		double meanPrice = (finalPrice1 + finalPrice2) / 2;

		System.out.println(finalPrice1);

		System.out.println(finalPrice2);

		System.out.println(meanPrice);

	}
}