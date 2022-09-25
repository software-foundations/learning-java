package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.TreeSet;

public class HomogeneousSet {

	public static void main ( String[] args ) {

		// Set must contains only Strings

		// Does not respect insetion order
		// Set<String> approvedSet = new HashSet<String>();

		// It is still not respecting insertion order
		// Set<String> approvedSet = new TreeSet<String>();

		// It Obeys insertion order
		// SortedSet<String> approvedSet = new TreeSet<>();
		TreeSet<String> approvedSet = new TreeSet<String>();

		approvedSet.add("Paul");
		approvedSet.add("Bruno");
		approvedSet.add("Lewandowisk");

		// Note that HashSet does not obey insertion order
		// It is ordered alphabetically
		for(String name: approvedSet) {
			System.out.println(name);
		}

		Set<Integer> numbers = new TreeSet<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		// Both works
		for(int n: numbers) {
			System.out.println(n);
		}

		for(Integer n: numbers) {
			System.out.println(n);
		}

	}

}