package com.star.sud.corejava.collection.list.vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VectorByIntegerExample {

	public static void main(String[] args) {

		List<Integer> llist = new LinkedList<Integer>();
		llist.add(4);
		llist.add(2);
		llist.add(1);
		llist.add(3);
		llist.add(4, 5);

		// Iterate by using index
		for (int i = 0; i < llist.size(); i++) {
			Integer value = llist.get(i);
			System.out.println(value);
		}

		// Iterate By Using Iterator
		Iterator<Integer> iterator = llist.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}

		// Iterate By Using forEach
		for (Integer string : llist) {
			System.out.println(string);
		}
	}

}
