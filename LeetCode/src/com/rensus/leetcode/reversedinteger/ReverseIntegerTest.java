package com.rensus.leetcode.reversedinteger;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseIntegerTest {
	
	
	private ReverseInteger ri = new ReverseInteger();
	
	@Test
	public void test(){
		int i = 12345;
		int e = 54321;
		check(i,e);
	}

	@Test
	public void testt(){
		int i = -12345;
		int e = -54321;
		check(i,e);
	}
	
	@Test
	public void test0(){
		int i = 1;
		int e = 1;
		check(i,e);
	}
	
	@Test
	public void test1(){
		int i = 100;
		int e = 1;
		check(i,e);
	}
	
	@Test
	public void test11(){
		int i = -100;
		int e = -1;
		check(i,e);
	}
	
	
	@Test
	public void test2(){
		int i = 1001;
		int e = 1001;
		check(i,e);
	}
	
	@Test
	public void test3(){
		int i = 10000000;
		int e = 1;
		check(i,e);
	}
	
	@Test
	public void test4(){
		int i = Integer.MAX_VALUE + 1;
		int e = 0;
		check(i,e);
	}
	
	@Test
	public void test5(){
		int i = -1;
		int e = -1;
		check(i,e);
	}
	
	@Test
	public void test6(){
		int i = Integer.MIN_VALUE - 1;
		int e = 0;
		check(i,e);
	}
	
	@Test
	public void test7(){
		int i = 0;
		int e = 0;
		check(i,e);
	}
	
	private void check(int i, int e){
		int result = ri.reverse(i);
		assertTrue(result == e);
	}
}
