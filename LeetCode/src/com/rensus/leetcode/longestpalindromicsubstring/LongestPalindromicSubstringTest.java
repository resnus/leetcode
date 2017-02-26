package com.rensus.leetcode.longestpalindromicsubstring;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
	
	
	private LongestPalindromicSubstring ls;
	
	@Before
	public void setUp(){
		ls = new LongestPalindromicSubstring();
	}
	
	@Test
	public void test0(){
		String s = "a";
		String[] results = {"a"};
		check(s, results);
	}
	
	@Test
	public void test1(){
		String s = "aba";
		String[] results = {"aba"};
		check(s, results);
	}
	
	@Test
	public void test3(){
		String s = "";
		String[] results = {""};
		check(s, results);
	}
	
	@Test
	public void test4(){
		String s = "dabac";
		String[] results = {"aba"};
		check(s, results);
	}
	
	@Test
	public void test5(){
		String s = "abcdefgaba";
		String[] results = {"aba"};
		check(s, results);
	}

	@Test
	public void test6(){
		String s = "abvqwdefgqeaabbccddeeddccbbaagvsdxcvadfrgqerg";
		String[] results = {"aabbccddeeddccbbaa"};
		check(s, results);
	}
	
	@Test
	public void test7(){
		String s = "abcdasdfghjkldcba";
		String[] results = {"a"};
		check(s, results);
	}
	
	@Test
	public void test8(){
		String s = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"; 
		String[] results = {"sknks"};
		check(s, results);
	}

	private void check(String s, String[] results){
		long start = System.currentTimeMillis();
		String palindrome = ls.longestPalindrome(s);
		System.out.println("Runtime: " + (System.currentTimeMillis() - start) + "ms");
		boolean found = false;
		for(String rs : results){
			if(rs.equals(palindrome)) found = true;
		}
		assertTrue("Not expected result: " + palindrome + " expected: " + printArray(results), found);
	}
	
	public String printArray(String[] results){
		StringBuilder sb = new StringBuilder();
		for(String s : results){
			sb.append("[" + s + "] ");
		}
		return sb.toString();
	}
	
}
