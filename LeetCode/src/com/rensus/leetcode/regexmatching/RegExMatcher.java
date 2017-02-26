package com.rensus.leetcode.regexmatching;

public class RegExMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegExMatcher regex = new RegExMatcher();
		String s = "aaa";
		String p = "a*";
		regex.isMatch(s, p);

	}

	/**
	 * '.' Matches any single character. '*' Matches zero or more of the
	 * preceding element.
	 * 
	 * The matching should cover the entire input string (not partial).
	 * 
	 * The function prototype should be: bool isMatch(const char *s, const char
	 * *p)
	 * 
	 * isMatch("aa","a") → false
	 * isMatch("aa","aa") → true
	 * isMatch("aaa","aa") → false
	 * isMatch("aa", "a*") → true
	 * isMatch("aa", ".*") → true
	 * isMatch("ab", ".*") → true
	 * isMatch("aab", "c*a*b") → true
	 * 
	 * @param s
	 * @param p
	 * @return
	 */
	public boolean isMatch(String s, String p) {
		if(!p.contains("*") && !p.contains(".")){
			return s.equals(p);
		}
		
		
		return false;
	}
}
