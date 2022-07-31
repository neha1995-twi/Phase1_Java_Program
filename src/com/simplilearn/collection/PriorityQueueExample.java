package com.simplilearn.collection;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Dhruvik");
		queue.add("Neha");
		queue.add("Pratima");
		queue.add("Dhruvik");
		queue.add("Ananth");
		queue.add("11a");
		// list.add(null);

		// Pratima  -  neha  -   -    - --> Head
 		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.element());
		
		System.out.println(queue.peek());
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
	}

}
