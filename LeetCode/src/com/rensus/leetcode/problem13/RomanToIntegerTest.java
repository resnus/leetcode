package com.rensus.leetcode.problem13;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Symbol I V X L C D M Value 1 5 10 50 100 500 1,000
 * 
 * @author resnus
 *
 */
public class RomanToIntegerTest {

	private RomanToInteger itr = new RomanToInteger();

	@Test // Sanity check, basic values
	public void sanity() {
		check(1, "I");
		check(5, "V");
		check(10, "X");
		check(50, "L");
		check(100, "C");
		check(500, "D");
		check(1000, "M");
	}
	
	@Test // Sanity check, basic values
	public void sanity2() {
		check(111, "CXI");
		check(555, "DLV");
		check(222, "CCXXII");
		check(333, "CCCXXXIII");
		check(444, "CDXLIV");
		check(555, "DLV");
		check(666, "DCLXVI");
	}

	@Test // Sanity check, basic values
	public void outOfBounds() {
		check(-1, null);
	}

	@Test
	public void test() {
		check(111, "CXI");
		check(1234, "MCCXXXIV");
		check(3976, "MMMCMLXXVI");
	}

	@Test
	public void test9() {
		check(9, "IX");
	}
	
	@Test
	public void test99() {
		check(99, "XCIX");
	}

	private void check(int expected, String num) {
		int result = itr.romanToInt(num);
		assertTrue("Results dont match. num =" + num + " "  + result + " != " + expected, expected == result);
	}

}
