package DATAStructure;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.*;

public class UseQueue {

	public static <object> void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("abc");
		queue.add("def");
		queue.add("ghi");
		queue.add("jkl");
		queue.add("mno");
		queue.add("pqr");
		queue.add("stu");
		queue.add("vwx");

		System.out.println("Queue head = " + queue.element());

		System.out.println("Removing element from queue = " + queue.poll());

		System.out.println("Queue head now = " + queue.element());

		System.out.println("Removing element from queue = " + queue.poll());

		System.out.println("Queue head now = " + queue.element());

		System.out.println("\nRemaining Queue elements...");

		System.out.println("WHILE WITH ITERATOR");

		String ob;
		while ((ob = queue.poll()) != null) {
			System.out.println(ob);
				queue.poll();


			}

		for(int i = 0; i<10;i++) {
				System.out.println(i);
			}

	}
}



