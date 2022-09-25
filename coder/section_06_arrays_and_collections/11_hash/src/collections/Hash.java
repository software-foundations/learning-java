package collections;

import java.util.HashSet;

public class Hash {

	public static void main (String[] args) {

		HashSet<User2> users = new HashSet<User2>();

		users.add(new User2("Peter"));
		users.add(new User2("Martin"));
		users.add(new User2("Michael"));

		boolean hasUser1 = users.contains(new User2("Fred"));
		boolean hasUser2 = users.contains(new User2("Michael"));

		System.out.println(hasUser1);
		System.out.println(hasUser2);

	}

}