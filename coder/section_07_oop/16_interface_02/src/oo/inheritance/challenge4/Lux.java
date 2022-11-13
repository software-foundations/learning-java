package oo.inheritance.challenge4;

public interface Lux {

	void turnOnRefrigeration();
	void turnOffRefrigeration();
	default int refrigeratorSpeed() {
		return 1;
	}
}