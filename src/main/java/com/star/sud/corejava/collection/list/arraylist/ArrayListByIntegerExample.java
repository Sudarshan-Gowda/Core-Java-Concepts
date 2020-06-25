package com.star.sud.corejava.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListByIntegerExample {

	public static void main(String[] args) {

		List<Integer> alist = new ArrayList<Integer>();
		alist.add(4);
		alist.add(2);
		alist.add(1);
		alist.add(3);
		alist.add(4, 5);

		// Iterate by using index
		for (int i = 0; i < alist.size(); i++) {
			Integer value = alist.get(i);
			System.out.println(value);
		}

		// Iterate By Using Iterator
		Iterator<Integer> iterator = alist.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}

		// Iterate By Using forEach
		for (Integer string : alist) {
			System.out.println(string);
		}
	}

}
