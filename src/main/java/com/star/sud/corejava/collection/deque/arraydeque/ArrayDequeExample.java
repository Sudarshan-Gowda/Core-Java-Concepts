package com.star.sud.corejava.collection.deque.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ArrayDeque class implements the Deque interface. It facilitates us to use the
 * Deque. Unlike queue, we can add or delete the elements from both the ends.
 *
 */
public class ArrayDequeExample {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Kris");
		deque.add("Zaheer");
		deque.add("John");
		deque.add("Virat");
		deque.add("Meera");

		for (String string : deque) {
			System.out.println(string);
		}

		System.out.println("Using peek/element function");
		System.out.println(deque.peek());
		System.out.println(deque.element());

		System.out.println("Using first/last");
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());

		System.out.println("== poll/remove ===");
		deque.poll();
		deque.remove();
		for (String string : deque) {
			System.out.println(string);
		}

	}

}
