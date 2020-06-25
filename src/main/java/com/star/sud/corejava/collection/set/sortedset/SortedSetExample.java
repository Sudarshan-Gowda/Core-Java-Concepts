package com.star.sud.corejava.collection.set.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet is the alternate of Set interface that provides a total ordering on
 * its elements. The elements of the SortedSet are arranged in the increasing
 * (ascending) order. The SortedSet provides the additional methods that inhibit
 * the natural ordering of the elements.
 *
 */
public class SortedSetExample {

	public static void main(String[] args) {

		SortedSet<String> sset = new TreeSet<String>();
		sset.add("CC");
		sset.add("DD");
		sset.add("AA");
		sset.add("BB");

		// It does not allow duplicate as well as null value
		sset.add("BB");
		sset.add(null); // Throw null pointer exception while retrieving elements

		Iterator<String> iterator = sset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
