package com.star.sud.corejava.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet class represents the LinkedList implementation of Set
 * Interface. It extends the HashSet class and implements Set interface. Like
 * HashSet, It also contains unique elements. It maintains the insertion order
 * and permits null elements.
 *
 */
public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("CC");
		set.add("DD");
		set.add("AA");
		set.add("BB");
		
		set.add("BB");
		set.add(null);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
