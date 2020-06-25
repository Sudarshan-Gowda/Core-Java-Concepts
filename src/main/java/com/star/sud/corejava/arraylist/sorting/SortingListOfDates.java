package com.star.sud.corejava.arraylist.sorting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortingListOfDates {

	public static void main(String[] args) throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<Date> arrays = new ArrayList<Date>();
		arrays.add(dateFormat.parse("2018-01-20"));
		arrays.add(dateFormat.parse("2016-09-20"));
		arrays.add(dateFormat.parse("2020-04-20"));
		arrays.add(dateFormat.parse("2015-03-20"));
		arrays.add(dateFormat.parse("2019-12-20"));

		System.out.println("Dates: Before Parsing");
		for (Date date : arrays) {
			System.out.println(date);
		}

		Collections.sort(arrays);
		System.out.println("Dates: After Parsing");
		for (Date date : arrays) {
			System.out.println(date);
		}

		// To sort in ascending order
		Collections.reverse(arrays);
		// Collections.sort(arrays, Collections.reverseOrder());
		System.out.println("Dates: In Reverse Order");
		for (Date date : arrays) {
			System.out.println(date);
		}

	}

}
