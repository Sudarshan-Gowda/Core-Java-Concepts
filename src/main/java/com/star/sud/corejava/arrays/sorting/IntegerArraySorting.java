package com.star.sud.corejava.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class IntegerArraySorting {

	public static void main(String[] args) {

		Integer[] intarry = new Integer[] { 5, 2, 4, 1, 3 };

		// Before Sort
		for (Integer integer : intarry) {
			System.out.println(integer);
		}

		// After Sort - Ascending
		System.out.println("Ascending Order Sort");
		Arrays.sort(intarry);
		for (Integer integer : intarry) {
			System.out.println(integer);
		}

		// To sort in descending
		System.out.println("Descending Order Sort");
		Arrays.sort(intarry, Collections.reverseOrder());
		for (Integer integer : intarry) {
			System.out.println(integer);
		}

	}

}
