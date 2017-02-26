package com.rensus.leetcode.addtwonumbers;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {
	
	private ListNode a,b;
	
	
	@Before
	public void Setup(){
		
	}
	
	@Test
	public void testA(){
		final int[] digitsA = {1,2,3,4};
		check(digitsA);
	}
	
	@Test
	public void testB(){
		final int[] digitsB = {5,6,7,8,9};
		check(digitsB);
	}

	@Test 
	public void testAdding(){
		int[] a = {2, 4, 3};
		int[] b = {5, 6, 4};
		int[] c = {7, 0, 8};
		ListNode l1 = AddTwoNumbers.create(a);
		//AddTwoNumbers.iterate(l1);
		ListNode l2 = AddTwoNumbers.create(b);
		//AddTwoNumbers.iterate(l2);

		AddTwoNumbers adder = new AddTwoNumbers();
		ListNode nd = adder.addTwoNumbers(l1, l2);
		checkEquality(c, nd);
		//AddTwoNumbers.iterate(nd);
	}
	
	@Test 
	public void testAdding2(){
		int[] a = {2, 4, 3, 9, 6, 3};
		int[] b = {9, 6, 4, 9};
		int[] c = {1, 1, 8, 8, 7, 3};
		ListNode l1 = AddTwoNumbers.create(a);
		//AddTwoNumbers.iterate(l1);
		ListNode l2 = AddTwoNumbers.create(b);
		//AddTwoNumbers.iterate(l2);

		AddTwoNumbers adder = new AddTwoNumbers();
		ListNode nd = adder.addTwoNumbers(l1, l2);
		checkEquality(c, nd);
		//AddTwoNumbers.iterate(nd);
	}
	
	@Test 
	public void testAdding3(){
		int[] a = {5};
		int[] b = {5};
		int[] c = {0,1};
		ListNode l1 = AddTwoNumbers.create(a);
		//AddTwoNumbers.iterate(l1);
		ListNode l2 = AddTwoNumbers.create(b);
		//AddTwoNumbers.iterate(l2);

		AddTwoNumbers adder = new AddTwoNumbers();
		ListNode nd = adder.addTwoNumbers(l1, l2);
		checkEquality(c, nd);
		//AddTwoNumbers.iterate(nd);
	}
	
	
	private static void check(int[] digits){
		ListNode node = AddTwoNumbers.create(digits);
		for(int i = 0; i < digits.length; i++){
			System.out.print(digits[i] + "=" + node.val + "\t");
			assertTrue("Not equal values! " + digits[i] + "!=" + node.val
					, digits[i] == node.val);
			node = node.next;
		}
		System.out.println("\n");
	}
	
	private static void checkEquality(int[] digits, ListNode ln){
		for(int i = 0; i < digits.length; i++){
			System.out.print(digits[i] + "=" + ln.val + "\t");
			assertTrue("Not equal values! " + digits[i] + "!=" + ln.val
					, digits[i] == ln.val);
			ln = ln.next;
		}
		System.out.println("\n");
	}
}
