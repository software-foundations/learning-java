package classesandmethods;

public class Dinner {

	public static void main ( String[] args ) {

		Person person = new Person("Bruno", 50.0);

		Food rice = new Food("Rice", 0.3);

		Food meat = new Food("Meat", 0.2);

		double weightAfterEat = person.weight;

		person.eat( rice );

		person.eat( meat );

		System.out.printf(
			"%.3f -> %.3f",
			weightAfterEat, person.weight);

	}

}