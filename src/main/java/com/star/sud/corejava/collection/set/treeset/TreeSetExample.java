package com.star.sud.corejava.collection.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 * Like HashSet, TreeSet also contains unique elements. However, the access and
 * retrieval time of TreeSet is quite fast. The elements in TreeSet stored in
 * ascending order.
 *
 */
public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> tset = new TreeSet<String>();
		tset.add("DD");
		tset.add("EE");
		tset.add("AA");
		tset.add("BB");
		tset.add("CC");

		// It does not allow duplicate as well as null value
		tset.add("CC");
		tset.add(null); // Throw null pointer exception while retrieving elements

		Iterator<String> iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
