package collections;

import java.util.Deque;
import java.util.ArrayDeque;

public class Stack {

	public static void main (String[] args) {

		Deque<String> books = new ArrayDeque<String>();

		// returns true/false
		books.add("The little prince");

		// return nothing. In contrast, it throws an exception when the defined limit size is reached
		books.push("Pinocchio");

		books.push("Hobbit");

		for(String book: books) {
			System.out.println(book);
		}

		// show element at the top of the stack
		System.out.println(books.peek());
		System.out.println(books.element());

		// pop(), poll(), and remove() methods
		System.out.println(books.pop());
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.poll());

		// System.out.println(books.remove()); // will raise an exception

		// size(), clear(), contains(), isEmpty()

	}

}