package oo.inheritance.challenge3;

public class Ferrari extends Car implements Sportive, Lux {

	private boolean isTurboAllowed;
	private boolean isRefrigerationAllowed;

	Ferrari() {
		this(300);
	}

	Ferrari(int maxVelocity) {
		super(maxVelocity);
		this.velocityIncrement = 15;
	}

	@Override
	public void turnOnTurbo(){
		this.isTurboAllowed = true;
	}

	@Override
	public void turnOffTurbo(){
		this.isTurboAllowed = false;
	}

	@Override
	public void turnOnRefrigeration(){
		this.isRefrigerationAllowed = true;
	}

	@Override
	public void turnOffRefrigeration(){
		this.isRefrigerationAllowed = false;
	}

	@Override
	public int getVelocityIncrement() {
		if(this.isTurboAllowed && !this.isRefrigerationAllowed) {
			return 35;
		} else if (this.isTurboAllowed && this.isRefrigerationAllowed) {
			return 30;
		} else if (!this.isTurboAllowed && !this.isRefrigerationAllowed) {
			return 20;
		} else {
			return 15;
		}
	}
	
}