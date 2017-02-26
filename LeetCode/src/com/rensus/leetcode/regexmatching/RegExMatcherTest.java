package com.rensus.leetcode.regexmatching;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RegExMatcherTest {

	private RegExMatcher regex;

	@Before
	public void setUp() {
		this.regex = new RegExMatcher();
	}

	@Test
	public void test() {
		String s = "aaa";
		String p = "a*";
		boolean r = true;
		check(s, p, r);
	}

	@Test
	public void test0() {
		String s = "abcde1234";
		String p = "abcde1234";
		boolean r = true;
		check(s, p, r);
	}
	
	@Test
	public void test01() {
		String s = "abcde1234";
		String p = "abcde12345";
		boolean r = false;
		check(s, p, r);
	}
	
	@Test
	public void test1() {
		check("aa", "a", false);
	}

	@Test
	public void test2() {
		check("aa", "aa", true);
	}

	@Test
	public void test3() {
		check("aaa", "aa", false);
	}

	@Test
	public void test4() {
		check("aa", "a*", true);
	}

	@Test
	public void test5() {
		check("aa", ".*", true);
	}

	@Test
	public void test6() {
		check("ab", ".*", true);
	}

	@Test
	public void test7() {
		check("aab", "c*a*b", true);
	}

	public void check(String s, String p, boolean r) {
		long start = System.currentTimeMillis();
		boolean isMatch = regex.isMatch(s, p);
		assertTrue("expected: " + r + " got: " + isMatch, r == isMatch);
		System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
	}

}
