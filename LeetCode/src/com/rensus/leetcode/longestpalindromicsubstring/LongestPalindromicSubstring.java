package com.rensus.leetcode.longestpalindromicsubstring;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author resnus
 *
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a,b,c,d,e
		//final String s = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpieljglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpieljglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdjglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdjglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdjglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixd"; 
		final String s = "caba"; // 7,11= 4,0
		long start  = System.currentTimeMillis();
		LongestPalindromicSubstring ls = new LongestPalindromicSubstring();
		String palindrome = ls.longestPalindrome(s);
		System.out.println("Palindrome: " + palindrome + " runtime: " + (System.currentTimeMillis() - start) + "ms");
	}
	
	/**
	 * Given a string s, find the longest palindromic substring in s. 
	 * You may assume that the maximum length of s is 1000.
	 * 
	 * @param s
	 * @return
	 */
    public String longestPalindrome(String s) { // 1256
    	if(s.length() < 2) return s;
    	
    	int max_count = 0, max_position = 0;
    	int position = 0, count = 0;
    	final String reversed = new StringBuilder(s).reverse().toString();
    	// abac 
    	// caba
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == reversed.charAt(s.length() - i - 1)){
    			count++;
    			position = i;
    		}else{
    			if(count > max_count)
    				max_position = position - count;
    			count = 0;
    			position = i;
    		}
    	}
    	
    	return s.substring(max_position, max_position + count);
    }

    
    /* WORKS
    public String longestPalindrome(String s) {
    	if(s.length() < 2) return s;
    	
    	final String reversed = new StringBuilder(s).reverse().toString();
    	String palindrome = "";
    	
    	for(int i = 0; i < s.length()+1; i++){
    		for(int y = s.length(); y > 0 && y > i; y--){
    			String sub = s.substring(i, y);
    			if(palindrome.length() < sub.length() &&
    					sub.equals(reversed.substring(s.length()-y, s.length()-i))){
    				palindrome = sub;
    			}
    		}
    	}
    	
    	return palindrome;
    }
    */
}
