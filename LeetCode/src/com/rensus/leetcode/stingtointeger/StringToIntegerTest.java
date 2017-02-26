package com.rensus.leetcode.stingtointeger;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * The function first discards as many whitespace characters as necessary until
 * the first non-whitespace character is found. Then, starting from this
 * character, takes an optional initial plus or minus sign followed by as many
 * numerical digits as possible, and interprets them as a numerical value.
 * 
 * The string can contain additional characters after those that form the
 * integral number, which are ignored and have no effect on the behavior of this
 * function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid
 * integral number, or if no such sequence exists because either str is empty or
 * it contains only whitespace characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned. If the
 * correct value is out of the range of representable values, INT_MAX
 * (2147483647) or INT_MIN (-2147483648) is returned.
 * 
 * @author resnus
 *
 */
public class StringToIntegerTest {

	public static final int MAX = Integer.MAX_VALUE;
	public static final int MIN = Integer.MIN_VALUE;

	private StringToInteger sti;

	@Before
	public void setUp() {
		sti = new StringToInteger();
	}

	@Test
	public void test0() {
		String input = "12345";
		int expected = 12345;
		check(input, expected);
	}

	@Test
	public void test1() {
		String input = "-12345";
		int expected = -12345;
		check(input, expected);
	}

	@Test
	public void test2() {
		String input = "asvqewrbg";
		int expected = 0;
		check(input, expected);
	}

	@Test
	public void test3() {
		String input = "-asdf";
		int expected = 0;
		check(input, expected);
	}

	@Test
	public void test4() {
		String input = "-a1b2c3f";
		int expected = 0;
		check(input, expected);
	}

	@Test
	public void test5() {
		String input = "";
		int expected = 0;
		check(input, expected);
	}

	@Test
	public void test6() {
		String input = "!@^$)!&@^$)!&@";
		int expected = 0;
		check(input, expected);
	}

	@Test
	public void test7() {
		// 2147483647
		String input = "2147483647"; // MAX_INT
		int expected = 2147483647;
		check(input, expected);
	}

	@Test
	public void test8() {
		// -2147483648
		String input = "-2147483648"; // MIN_INT
		int expected = -2147483648;
		check(input, expected);
	}

	@Test
	public void test9() {
		// 2147483647
		String input = "2147483648"; // MAX_INT
		int expected = 2147483647;
		check(input, expected);
	}

	@Test
	public void test10() {
		// -2147483648
		String input = "-2147483649"; // MIN_INT
		int expected = -2147483648;
		check(input, expected);
	}

	@Test
	public void test11() {
		// -2147483648
		String input = "-2147483649asfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdfasfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdfas1245125341253fdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sj1231245dfasdfasfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdf12341234"; // MIN_INT
		int expected = -2147483648;
		check(input, expected);
	}

	@Test
	public void test12() {
		String input = "+-2";
		int expected = 0;
		check(input, expected);
	}

	public void check(String input, int expected) {
		long start = System.currentTimeMillis();
		int result = sti.myAtoi(input);
		assertTrue("Expected:" + expected + " returned:" + result, result == expected);
		System.out.println("Took:" + (System.currentTimeMillis() - start) + "ms");
	}

}
