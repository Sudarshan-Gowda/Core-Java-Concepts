package com.star.sud.corejava.collection.list.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExampleByString {

	public static void main(String[] args) {

		List<String> vlist = new Vector<String>();
		vlist.add("India");
		vlist.add("Singapore");
		vlist.add("US");
		vlist.add("Australia");
		vlist.add(4, "Japan");

		// Iterate by using index
		for (int i = 0; i < vlist.size(); i++) {
			String value = vlist.get(i);
			System.out.println(value);
		}

		// Iterate By Using Iterator
		Iterator<String> iterator = vlist.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// Iterate By Using forEach
		for (String string : vlist) {
			System.out.println(string);
		}

	}

}
