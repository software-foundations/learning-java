package classesandmethods;

public class Person {

	String name;

	double weight;

	Person ( String name, double weight ) {

		this.name = name;

		this.weight = weight;

	}

	public void eat ( Food food ) {

		this.weight += food.weight;

	}
}