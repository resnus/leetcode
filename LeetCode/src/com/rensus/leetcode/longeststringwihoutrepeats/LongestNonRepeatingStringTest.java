package com.rensus.leetcode.longeststringwihoutrepeats;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LongestNonRepeatingStringTest {
	
	private LongestNonRepeatingString ls;
	
	@Before
	public void setUp(){
		this.ls = new LongestNonRepeatingString();
	}

	
	@Test
	public void test0(){
		String s = "a";
		int c = 1;
		checkScenario(s,c);
	}
	
	@Test
	public void test1(){
		String s = "";
		int c = 0;
		checkScenario(s,c);
	}
	
	@Test
	public void test2(){
		String s = "abc";
		int c = 3;
		checkScenario(s,c);
	}

	@Test
	public void test3(){
		String s = "aaa";
		int c = 1;
		checkScenario(s,c);
	}
	
	@Test
	public void test4(){
		String s = "abaa";
		int c = 2;
		checkScenario(s,c);
	}
	
	@Test
	public void test5(){
		String s = "aabbcc";
		int c = 2;
		checkScenario(s,c);
	}
	
	@Test
	public void test6(){
		String s = "aabzzzbcc";
		int c = 3;
		checkScenario(s,c);
	}
	
	@Test
	public void test7(){
		String s = "abcadeaefaabcdef";
		int c = 6;
		checkScenario(s,c);
	}
	
	@Test
	public void test8(){
		String s = "abcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdefabcadeaefaabcdef";
		int c = 6;
		checkScenario(s,c);
	}
	
	
	private void checkScenario(String s, int expected){
		long start = System.currentTimeMillis();
		int returned = ls.lengthOfLongestSubstring(s);
		System.out.println("==> Runtime: " + (System.currentTimeMillis() - start));
		assertTrue("Expected: " + expected + " returned: " + returned, 
				returned  == expected);
	}
}

