package com.star.sud.corejava.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExampleByGenerics {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "BB");
		map.put(2, "DD");
		map.put(3, "AA");
		map.put(4, "CC");
		map.put(5, "EE");

		// To fetch all the entries using Iterator
		System.out.println("=== Using Iterator ===");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			// System.out.println(next);
			System.out.println(next.getKey() + " " + next.getValue());
			// System.out.println(iterator.next().getKey() + " " +
			// iterator.next().getValue());
		}

		// To fetch all the entries using forEach
		System.out.println("=== Using ForEach ===");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Based on key
		System.out.println("=== Based on key ===");
		System.out.println(map.get(2));
		System.out.println(map.get(4));

		// Based on index/key
		System.out.println("=== Based on index of for loop ===");
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}

		// Using comparingByKey()
		System.out.println("=== comparingByKey ===");

		// Returns a Set view of the mappings contained in this map
		System.out.println(map.entrySet());

		// Returns a sequential Stream with this collection as its source
		System.out.println(map.entrySet().stream());

		// Sorted according to the provided Comparator
		// System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByKey()));

	}

}
