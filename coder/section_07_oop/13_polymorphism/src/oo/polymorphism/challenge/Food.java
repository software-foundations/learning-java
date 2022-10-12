package oo.polymorphism.challenge;

public class Food {

	private double weight;

	public Food(double weight) {
		this.setWeight(weight);
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		if (weight >= 0) {
			this.weight = weight;
		}
	}
}