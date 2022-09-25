package classesandmethods;

public class EqualsAndHashCode {

	public static void main ( String[] args ) {

		User user1 = new User();
		user1.name = "Bruno Conde";
		user1.email = "bruno@email.com";

		User user2 = new User();
		user2.name = "Bruno Conde";
		user2.email = "bruno@email.com";

		// true
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));

		// true
		System.out.println(user1 == user1);
		System.out.println(user1.equals(user1));
	}
}