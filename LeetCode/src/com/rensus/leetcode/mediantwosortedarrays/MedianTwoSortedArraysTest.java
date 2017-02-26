package com.rensus.leetcode.mediantwosortedarrays;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MedianTwoSortedArraysTest {

	private MedianTwoSortedArrays med;
	
	@Before
	public void setUp(){
		this.med = new MedianTwoSortedArrays();
	}

	
	@Test
	public void test000(){
		int[] nums1 = {};
		int[] nums2 = {};
		double expected = 0d;
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test00(){
		int[] nums1 = {1,2};
		int[] nums2 = {};
		double expected = 1.5d;
		check(nums1, nums2, expected);
	}	
	
	@Test
	public void test0(){
		int[] nums1 = {1,2};
		int[] nums2 = {3};
		double expected = 2d;
		check(nums1, nums2, expected);
	}		
	
	@Test
	public void test1(){
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		double expected = 2d;
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test2(){
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		double expected = 2.5d;
		check(nums1, nums2, expected);
	}

	@Test
	public void test22(){
		int[] nums1 = {1,2,3};
		int[] nums2 = {4,5,6};
		double expected = 3.5d; // 7/2
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test3(){
		int[] nums1 = {1,3,5,8,10};
		int[] nums2 = {4,6,9,12,15};
		// {1,3,4,5,6,8,9,10,12,15}
		double expected = 7d; // (6 + 8) /2
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test4(){
		int[] nums1 = {1,3,5,8};
		int[] nums2 = {4,6,9,17};
		double expected = 5.5d; // {1,3,4,5,6,8,9,17} (5+6)/2 = 5.5 
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test5(){
		int[] nums1 = {1,3,5,8};
		int[] nums2 = {4,6,9};
		double expected = 5d;
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test6(){
		int[] nums1 = {2,2,2};
		int[] nums2 = {2,2,2,2};
		double expected = 2d;
		check(nums1, nums2, expected);
	}
	
	@Test
	public void test7(){
		int[] nums1 = {2,2,2,2};
		int[] nums2 = {2,2,2};
		double expected = 2d;
		check(nums1, nums2, expected);
	}
	
	
	@Test
	public void test8(){
		int[] nums1 = {2,3};
		int[] nums2 = {1};
		double expected = 2d;
		check(nums1, nums2, expected);
	}
	private void check(int[]a, int[]b, double median){
		long start = System.currentTimeMillis();
		double m = med.findMedianSortedArrays(a, b);
		assertTrue("Expected: " + median + " got:" + m,
				median == m);
		System.out.println("Runtime: " + (System.currentTimeMillis() - start));
	}
}
