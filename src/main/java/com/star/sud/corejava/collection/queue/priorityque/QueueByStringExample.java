package com.star.sud.corejava.collection.queue.priorityque;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueByStringExample {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("AA");
		queue.add("BB");
		queue.add("CC");
		queue.add("DD");

		// Elements Before removal
		System.out.println("=== Elements before poll/remove ===");
		Iterator<String> iterator1 = queue.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		// To get the top of the element we can use peek/element
		System.out.println("head: " + queue.peek());
		System.out.println("head: " + queue.element());

		queue.remove();// This will remove elements from the list in first-in-first-out order

		queue.poll();// This will do the same action as remove

		System.out.println("=== Elements after poll/remove ===");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
