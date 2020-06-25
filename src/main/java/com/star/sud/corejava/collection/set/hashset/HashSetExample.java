package com.star.sud.corejava.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet class implements Set Interface. It represents the collection that
 * uses a hash table for storage. Hashing is used to store the elements in the
 * HashSet. It contains unique items.
 *
 * 
 * 
 */
public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("CC");
		set.add("DD");
		set.add("AA");
		set.add("BB");

		// Set does not allow duplicate elements
		set.add("DD");
		set.add(null);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
