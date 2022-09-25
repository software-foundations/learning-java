package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class MapClass {

	public static void main(String[] args) {

		Map<Integer, String> users = new HashMap<>();

		users.put(1, "Robert"); // adding
		users.put(1, "Terry"); // refreshing

		users.put(2, "Max");
		users.put(3, "Linna");

		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());

		System.out.println(users.containsKey(1));
		System.out.println(users.containsValue("John"));
		System.out.println(users.remove(1, "Linna"));

		for(int key: users.keySet()) {
			System.out.println(key);
		}

		for (String value: users.values()){
			System.out.println(value);
		}

		for(Entry<Integer, String> user: users.entrySet()){
			System.out.print(user.getKey() + " -> ");
			System.out.println(user.getValue());
		}
	}

}