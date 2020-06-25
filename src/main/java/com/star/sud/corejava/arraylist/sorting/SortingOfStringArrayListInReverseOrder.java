package com.star.sud.corejava.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfStringArrayListInReverseOrder {

	public static void main(String[] args) {

		ArrayList<String> listOfCountries = new ArrayList<String>();
		listOfCountries.add("India");
		listOfCountries.add("UK");
		listOfCountries.add("US");
		listOfCountries.add("Japan");
		listOfCountries.add("Singapore");

		System.out.println("=== Before Sorting ===");
		for (String country : listOfCountries) {
			System.out.println(country);
		}

		Collections.sort(listOfCountries, Collections.reverseOrder());

		System.out.println("=== After Sorting ===");
		for (String country : listOfCountries) {
			System.out.println(country);
		}

	}

}
