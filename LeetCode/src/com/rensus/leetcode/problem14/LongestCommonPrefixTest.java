package com.rensus.leetcode.problem14;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LongestCommonPrefixTest {
	private LongestCommonPrefix lcp = new LongestCommonPrefix();
	
	@Test
	public void test(){
		String[] strs = {
				"abcd",
				"abc"
		};
		check(strs, "abc");
	}
	
	@Test
	public void test1(){
		String[] strs = {
				"a",
				"a"
		};
		check(strs, "a");
	}
	
	@Test
	public void test2(){
		String[] strs = {
				"Alex Test",
				"Alex Test"
		};
		check(strs, "Alex Test");
	}
	
	@Test
	public void oneArray(){
		String[] strs = {
				"Alex Test"
		};
		check(strs, "Alex Test");
	}
	
	@Test
	public void multipleArraysOneVerySmall(){
		String[] strs = {
				"Alex Testss And some other value",
				"Alex Testss And",
				"Alex Testss",
				"A"
		};
		check(strs, "A");
	}
	
	
	@Test
	public void shortFirst(){
		String[] strs = {
				"A ",
				"Alex Testss And some other value",
				"Alex Testss And",
				"Alex Testss",
				"A"
		};
		check(strs, "A");
	}
	

	@Test
	public void multipleLongStrings(){
		String[] strs = {
				"Some test stringSome test stringSome test string",
				"Some test stringSome test stringSome test string",
				"Some test stringSome test stringSome test string",
				"Some test stringSome test stringSome test string",
				"Some test stringSome test stringSome test string",
		};
		check(strs, "Some test stringSome test stringSome test string");
	}
	
	@Test
	public void emptyString(){
		String[] strs = {
				""
		};
		check(strs, "");
	}
	
	@Test
	public void emptyArray(){
		String[] strs = {};
		check(strs, "");
	}
	
	private void check(String[] strs, String longestPrefix){
		String result = lcp.longestCommonPrefix(strs);
		assertTrue("Wrong result! " + result + " !=" + longestPrefix,
				result.equals(longestPrefix));
	}
}
