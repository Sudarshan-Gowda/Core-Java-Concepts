package com.star.sud.corejava.checkduplicatevalue;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateValues {

	public static void main(String[] args) {

		String[] sValue = new String[] { "a", "b", "c", "d", "", "", "e", "a" };
		boolean checkduplicateUsing2ForEach = checkduplicateUsing2ForEach(sValue);
		System.out.println(checkduplicateUsing2ForEach);
		boolean checkduplicateUsingSet = checkduplicateUsingSet(sValue);
		System.out.println(checkduplicateUsingSet);

	}

	private static boolean checkduplicateUsing2ForEach(String[] sValue) {

		for (int i = 0; i < sValue.length; i++) {

			if (sValue[i] == null || sValue[i].equals(""))
				continue;

			for (int j = 0; j < sValue.length; j++) {
				if (i == j)
					continue;

				if (sValue[i].equals(sValue[j]))
					return true;

			}

		}
		return false;
	}

	private static boolean checkduplicateUsingSet(String[] sValue) {

		Set<String> set = new HashSet<String>();

		for (String string : sValue) {

			if (set.contains(string))
				return true;

			else {
				if (!string.equals(""))
					set.add(string);
			}

		}
		return false;

	}

}
