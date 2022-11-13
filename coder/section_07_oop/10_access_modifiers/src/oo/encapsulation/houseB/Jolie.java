package oo.encapsulation.houseB;
import oo.encapsulation.houseA.Anne;
// Anne is Anne's mother-in-law

public class Jolie {

	void testAccess() {
		// secret (private)
		// iDoInsideTheHouseA (package)
		// wayOfSpeak (protected)
		// everybodyKnows (public)	
		
		Anne motherInLaw = new Anne();		
		System.out.println(motherInLaw.everybodyKnows);
	}
}