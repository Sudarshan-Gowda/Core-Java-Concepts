package com.star.sud.corejava.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class StringArraySorting {

	public static void main(String[] args) {

		String[] array = new String[] { "CC", "AA", "BB", "DD", "EE" };

		for (String string : array) {
			System.out.println(string);
		}

		System.out.println("After Sorting");
		Arrays.sort(array);
		for (String string : array) {
			System.out.println(string);
		}

		System.out.println("In Reverse Order");
		Arrays.sort(array, Collections.reverseOrder());
		for (String string : array) {
			System.out.println(string);
		}

	}

}
