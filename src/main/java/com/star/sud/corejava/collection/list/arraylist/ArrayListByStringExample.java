package com.star.sud.corejava.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListByStringExample {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<String>();
		alist.add("India");
		alist.add("Singapore");
		alist.add("US");
		alist.add("Australia");
		alist.add(4, "Japan");

		// Iterate by using index
		for (int i = 0; i < alist.size(); i++) {
			String value = alist.get(i);
			System.out.println(value);
		}

		// Iterate By Using Iterator
		Iterator<String> iterator = alist.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// Iterate By Using forEach
		for (String string : alist) {
			System.out.println(string);
		}
	}

}
