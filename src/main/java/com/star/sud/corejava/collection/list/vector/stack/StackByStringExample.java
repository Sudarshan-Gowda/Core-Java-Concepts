package com.star.sud.corejava.collection.list.vector.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackByStringExample {

	/**
	 * The stack is the subclass of Vector. It implements the last-in-first-out data
	 * structure, i.e., Stack. The stack contains all of the methods of Vector class
	 * and also provides its methods like boolean push(), boolean peek(), boolean
	 * push(object o), which defines its properties.
	 */
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("AA");
		stack.push("BB");
		stack.push("CC");
		stack.push("DD");

		stack.pop(); // Removes the element -> last-in-first-out

		for (int i = 0; i < stack.size(); i++) {
			String string = stack.get(i);
			System.out.println(string);
		}

		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (String string : stack) {
			System.out.println(string);
		}

	}

}
