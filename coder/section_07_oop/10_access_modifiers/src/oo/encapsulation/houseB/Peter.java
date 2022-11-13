package oo.encapsulation.houseB;

// Anne is in another package. So we need to import
import oo.encapsulation.houseA.Anne;

// Peter is the child of Anne, but they live in different house/packages
public class Peter extends Anne {	

	void testAccess() {
		// secret (private)
		// iDoInsideTheHouseA (package)
		// wayOfSpeak (protected)
		// everybodyKnows (public)	
		
		System.out.println(wayOfSpeak);
		System.out.println(everybodyKnows);
		System.out.println(new Anne().everybodyKnows);
	}
	
}