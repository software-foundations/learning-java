package oo.encapsulation.challenge.vehicle;

public class Ferrari extends Car {

	public Ferrari() {
		this(300);
	}

	public Ferrari(int maxVelocity) {
		super(maxVelocity);
		this.velocityIncrement = 15;
	}

	// public should be used when overriding, because we cannot use a less permissive access modifiers than the original reference have
	// @Override
	// public void accelerate() {
	// 	super.accelerate()
	// }
	
}