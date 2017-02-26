package com.rensus.leetcode.longeststringwihoutrepeats;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcabcabcdeb";
		LongestNonRepeatingString l = new LongestNonRepeatingString();
		int i = l.lengthOfLongestSubstring(s);
		System.out.println(i);
	}

	public Map<Integer, Integer> aggregateCounts(String s) {
		Map<Integer, Integer> chars = new HashMap<>();
		for (int c : s.toCharArray()) {
			if (chars.containsKey(c)) {
				int count = chars.get(c);
				chars.put(c, count + 1);
			} else {
				chars.put(c, 1);
			}
		}
		System.out.println(chars);
		return chars;
	}

	public int lengthOfLongestSubstring(String s) {
		char[] word = s.toCharArray();
		if(word.length < 2) return word.length;
		Set<Integer> current = new HashSet<>();
		int max = 0;
		for(int x = 0; x < word.length; x++){
			current.clear();
			for(int y = x; y < word.length; y++) {
				int c = word[y];
				if(current.contains(c)){
					break;
				}else{
					current.add(c);
				}
			}
			if(current.size() > max) max = current.size();
		}
		
		return max;
	}
	
	/* WORKS 
	public int lengthOfLongestSubstring(String s) {
		char[] word = s.toCharArray();
		if(word.length < 2) return word.length;
		Set<Integer> chars = new HashSet<>();
		int max = 0;
		for(int x = 0; x < word.length; x++){
			for(int y = x; y < word.length; y++) {
				int c = word[y];
				if(!chars.contains(c)) {
					chars.add(c);
				}else {
					if(chars.size() > max){ max = chars.size(); }
					chars.clear();
					break; // break inner loop; 
				}
			}
		}
		return max;
	}*/

}
