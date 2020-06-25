package com.star.sud.corejava.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListByObjectExample {

	public static void main(String[] args) {

		List<Employee> llist = new LinkedList<Employee>();
		llist.add(new Employee(1, "AA", "DEV"));
		llist.add(new Employee(2, "BB", "FN"));
		llist.add(new Employee(3, "CC", "IT"));
		llist.add(3, new Employee(4, "DD", "QA"));

		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		Iterator<Employee> iterator = llist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Employee employee : llist) {
			System.out.println(employee);
		}

	}

}
