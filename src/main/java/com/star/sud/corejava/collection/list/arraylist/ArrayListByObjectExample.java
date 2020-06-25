package com.star.sud.corejava.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListByObjectExample {

	public static void main(String[] args) {

		List<Employee> alist = new ArrayList<Employee>();
		alist.add(new Employee(1, "AA", "DEV"));
		alist.add(new Employee(2, "BB", "FN"));
		alist.add(new Employee(3, "CC", "IT"));
		alist.add(3, new Employee(4, "DD", "QA"));

		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}

		Iterator<Employee> iterator = alist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Employee employee : alist) {
			System.out.println(employee);
		}

	}

}
