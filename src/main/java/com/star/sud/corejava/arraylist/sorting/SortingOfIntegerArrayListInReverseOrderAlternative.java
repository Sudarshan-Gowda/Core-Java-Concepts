package com.star.sud.corejava.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfIntegerArrayListInReverseOrderAlternative {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(8);
		arrayList.add(12);
		arrayList.add(4);

		System.out.println("=== Before Sorting ===");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		Collections.sort(arrayList);
		Collections.reverse(arrayList);

		System.out.println("=== After Sorting ===");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

	}

}
