package oo.abstractclass.restaurant;

public class Dinner {

	public static void main(String[] args) {

		Person guest = new Person(50.0);

		Rice ingredient1 = new Rice();
		Food ingredient2 = new Bean();
		Food dessert = new IceCream();

		System.out.println(guest.getWeight());

		guest.eat(ingredient1);
		guest.eat(ingredient2);
		System.out.println(guest.getWeight());

		guest.eat(dessert);
		System.out.println(guest.getWeight());
	}
}