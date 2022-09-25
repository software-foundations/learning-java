package collections;

// import all classes of the package
//Doesn't work
//import collections.*;

import java.util.ArrayList;

public class List {

	public static void main( String[] args ) {

		ArrayList<User> list = new ArrayList<>();

		User user1 = new User("Bruno");

		list.add(user1);
		list.add(new User("Conde"));
		list.add(new User("John"));
		list.add(new User("Diana"));
		list.add(new User("William"));

		// Accessing by index
		// My name is Diana.		
		System.out.println(list.get(3));

		list.remove(1);

		boolean isRemoved1 = list.remove(new User("William"));
		boolean isRemoved2 = list.remove(new User("William"));
		// true / false
		System.out.println("Is removed? " + isRemoved1);
		System.out.println("Is removed? " + isRemoved2);

		// true
		boolean isInList = list.contains(new User("Bruno"));
		System.out.println("Is in list? " + isInList);

		for (User u: list) {
			System.out.println(u);
		}

	}

}