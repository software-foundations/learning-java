package classesandmethods;

public class User {

	String name;
	String email;

	public boolean equals(Object object) {
		if (object instanceof User) {

			// Casting Object (generic) to User
			// In fact, Object is the most generic class in Java
			User anotherUser = (User) object;
			// works, too. But, we should compare strings using .equals
			// boolean isNameEqual = anotherUser.name == this.name;
			boolean isNameEqual = anotherUser.name.equals(this.name);
			boolean isEmailEqual = anotherUser.email.equals(this.email);

			return isNameEqual && isEmailEqual;
		} else {
			return false;
		}
	}

	// hashcode will be discussed in another class
	public int hashcode() {
		return 0;
	}
}