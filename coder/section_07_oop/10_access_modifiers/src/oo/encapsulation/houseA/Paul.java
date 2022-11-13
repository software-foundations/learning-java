package oo.encapsulation.houseA;

public class Paul {

	Anne wife = new Anne();	

	void testAccess() {
		// secret (private)
		// iDoInsideTheHouseA (package)
		// wayOfSpeak (protected)
		// everybodyKnows (public)
		System.out.println(this.wife.iDoInsideTheHouseA);
		System.out.println(this.wife.wayOfSpeak);
		System.out.println(this.wife.everybodyKnows);
	}
	
}