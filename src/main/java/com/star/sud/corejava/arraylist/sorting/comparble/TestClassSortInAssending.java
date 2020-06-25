package com.star.sud.corejava.arraylist.sorting.comparble;

import java.util.ArrayList;
import java.util.Collections;

public class TestClassSortInAssending {

	public static void main(String[] args) {

		ArrayList<Student> alist = new ArrayList<Student>();
		Student std2 = new Student(2, "Meera", 10);
		Student std1 = new Student(1, "John", 30);
		Student std3 = new Student(3, "Akash", 20);

		alist.add(std1);
		alist.add(std2);
		alist.add(std3);

		// To Sort the elements
		Collections.sort(alist);

		for (Student student : alist)
			System.out.println(student);

	}

}
