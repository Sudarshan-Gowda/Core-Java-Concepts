package com.star.sud.corejava.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListByString {

	public static void main(String[] args) {

		List<String> llist = new LinkedList<String>();
		llist.add("India");
		llist.add("Singapore");
		llist.add("US");
		llist.add("Australia");

		// Iterate By Using Iterator
		Iterator<String> iterator = llist.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// Iterate By Using forEach
		for (String string : llist) {
			System.out.println(string);
		}

	}

}
