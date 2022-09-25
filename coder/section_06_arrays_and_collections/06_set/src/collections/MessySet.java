package collections;

import java.util.HashSet;
import java.util.Set;


public class MessySet {

	// The usage of this suppress will be discussed later
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main ( String[] args ) {

		HashSet set = new HashSet();

		set.add(1.2); // converts double -> Double
		set.add(true); // converts boolean -> Boolean
		set.add("Test"); // String remains String
		set.add('x'); // converts char -> Character
		set.add(1); // Converts int -> Integer

		// 5
		System.out.printf("Size of the set: %d", set.size());

		// does not raise error, but ...
		set.add("Test");

		// size remains 5
		System.out.printf("Size of the set: %d", set.size());

		// returns false, but not raises an error
		System.out.println(set.remove("abcde"));

		// returns true
		System.out.println(set.remove("Teste"));

		System.out.printf("Size of the set: %d", set.size());

		// returns false
		System.out.print(set.contains("xyz"));

		// returns true
		System.out.print(set.contains(1));

		///////////////////////

		// The using of Set when instantiating HashSet will be discussed later
		// But a think it make explicity that HashSet implements Set interface
		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(set);

		// Union between sets
		// it adds nums into set
		set.addAll(nums);

		System.out.println(set);

		// Intersection between sets
		set.retainAll(nums);

		// 1
		System.out.println(set);

		// clear a set
		set.clear();

		System.out.println(set);		
	}
}