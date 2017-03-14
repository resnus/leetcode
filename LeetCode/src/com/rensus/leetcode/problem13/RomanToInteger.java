package com.rensus.leetcode.problem13;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int romanToInt(String s) {
		if (s == null)
			return -1; // Edge case

		String values = "IVXLCDM";
		int[] increments = { 1, 5, 10, 50, 100, 500, 1000 };

		int result = 0;
		int tempIndex = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int c = s.charAt(i);
			int index = values.indexOf(c);
			if (index < tempIndex) {
				result -= increments[index];
			} else {
				result += increments[index];
			}
			tempIndex = index;
		}

		return result;
	}
}
