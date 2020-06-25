package com.star.sud.corejava.arraylist.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestClassSortDescending {

	public static void main(String[] args) {

		ArrayList<Student> alist = new ArrayList<Student>();
		Student std2 = new Student(2, "Meera", 10);
		Student std1 = new Student(1, "John", 30);
		Student std3 = new Student(3, "Akash", 20);

		alist.add(std1);
		alist.add(std2);
		alist.add(std3);

		// To Sort the elements based on Name
		System.out.println("====== Bbased on Name =========");
		Collections.sort(alist, Student.stdNameCompare);
		Collections.reverse(alist);

		for (Student student : alist)
			System.out.println(student);

		// To Sort the elements based on Age
		System.out.println("====== Based on Age =========");
		Collections.sort(alist, Student.stdAgeCompare);
		Collections.reverse(alist);

		for (Student student : alist)
			System.out.println(student);

	}

}
