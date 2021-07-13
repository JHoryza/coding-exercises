package dev.horyza.exercises;

import java.util.Arrays;

public class CheckPermutation {

	/*
	 * Given two strings, write a method to decide if one is a permutation of the
	 * other.
	 */

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dbca";
		boolean solution = isPermutation(s1, s2);
		System.out.println(solution);
	}

	private static boolean isPermutation(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			s1 = new String(c1);
			s2 = new String(c2);
			
			if (s1.equals(s2)) {
				return true;
			}
		}
		return false;
	}

}
