package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	public static void main (String[] args) {


	Queue<String> queue = new LinkedList<String>();

	// These two methods are to add elements
	queue.add("Bruno");
	queue.offer("Conde");
	queue.add("Mark");
	queue.offer("Lina");
	queue.add("Lisa");

	// These two methods are to get the next element
	String element = queue.peek();
	System.out.println(element + " has been taken!");
	System.out.println(queue.element() + " has been taken!");
	System.out.println(queue);

	System.out.println("Polled from queue: " + queue.poll());
	System.out.println(queue);
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println("Polled from queue: " + queue.poll());
	System.out.println(queue);

	queue.add("Bruno");
	queue.add("Conde");
	
	System.out.println("Removed from queue: " + queue.remove());
	System.out.println("Removed from queue: " + queue.remove());
	// Will raise an exception when the queue is empty
	// System.out.println("Removed from queue: " + queue.remove());
	System.out.println(queue);	
	}
}