package com.star.sud.corejava.collection.que.priorityque;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Kris");
		queue.add("Zaheer");
		queue.add("John");
		queue.add("Virat");
		queue.add("Meera");

		System.out.println("=== Before remove/poll ===");
		Iterator<String> iterator1 = queue.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		System.out.println("=== peek/element function  ===");
		System.out.println(queue.peek());
		System.out.println(queue.element());

		queue.poll();
		queue.remove();
		System.out.println("=== After poll ===");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
