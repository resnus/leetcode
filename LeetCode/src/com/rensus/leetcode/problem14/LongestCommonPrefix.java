package com.rensus.leetcode.problem14;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * @author resnus
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";
		if(strs.length == 1) // Edge case
			return strs[0];

		StringBuilder sb = new StringBuilder("");

		int ch = -1;
		int position = 0;
		while (true) { // Position loop
			for (int i = 0; i < strs.length; i++) { // String loop
				if((position) == strs[i].length()) return sb.toString();
				
				int c = strs[i].charAt(position);
				if (c != ch && ch > 0) {
					return sb.toString();
				}
				ch = c;
			}
			sb.append((char) ch); // Add to results
			ch = -1; // Reset temp
			position++;
		}
	}
	
//	public String longestCommonPrefix(String[] strs) {
//		if(strs.length == 0)
//			return "";
//		if(strs.length == 1) // Edge case
//			return strs[0];
//
//		StringBuilder sb = new StringBuilder("");
//
//		int ch = -1;
//		int position = 0;
//		while (true) { // Position loop
//			for (int i = 0; i < strs.length; i++) { // String loop
//				if((position) == strs[i].length()) return sb.toString();
//				
//				int c = strs[i].charAt(position);
//				if (c != ch && ch > 0) {
//					return sb.toString();
//				}
//				ch = c;
//			}
//			sb.append((char) ch); // Add to results
//			ch = -1; // Reset temp
//			position++;
//		}
//	}
	
//	public String longestCommonPrefix(String[] strs) {
//		if(strs.length == 0)
//			return "";
//		if(strs.length == 1) // Edge case
//			return strs[0];
//
//		StringBuilder sb = new StringBuilder("");
//		int minArrayLength = Arrays.stream(strs).map(String::length).min(Integer::compareTo).get();
//
//		int ch = -1;
//		for (int y = 0; y < minArrayLength; y++) { // Position loop
//			for (int i = 0; i < strs.length; i++) { // String loop
//				int c = strs[i].charAt(y);
//				if (c != ch && ch > 0) {
//					return sb.toString();
//				}
//				ch = c;
//			}
//			sb.append((char) ch); // Add to results
//			ch = -1; // Reset temp
//		}
//		return sb.toString();
//	}
}
