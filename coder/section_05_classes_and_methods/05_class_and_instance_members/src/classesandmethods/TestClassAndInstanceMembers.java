package classesandmethods;

public class TestClassAndInstanceMembers {

	public static void main ( String[] args ) {

		ClassAndInstanceMembers a1 = new ClassAndInstanceMembers(10);

		ClassAndInstanceMembers a2 = new ClassAndInstanceMembers(5);

		// Static member 'classesandmethods.ClassAndInstanceMembers.pi' accessed via instance reference
		// Now, we cannot to alter PI 'cause it is a constant
		// a1.PI = 3.1415;

		// Now, we cannot to alter PI 'cause it is a constant
		// ClassAndInstanceMembers.pi = 3.1415;

		System.out.println(ClassAndInstanceMembers.PI);

		System.out.println(a1.area());
		System.out.println(ClassAndInstanceMembers.area(10));

		System.out.println(a2.area());
		System.out.println(ClassAndInstanceMembers.area(5));

	}
}