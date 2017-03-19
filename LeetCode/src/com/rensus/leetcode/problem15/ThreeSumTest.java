package com.rensus.leetcode.problem15;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

	private ThreeSum ts;
	
	@Before
	public void init(){
		this.ts = new ThreeSum();
	}

	@Test
	public void example() {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int[][] triplets = {
				{-1, 0, 1},
				{-1, -1, 2}	
		};
		check(nums, triplets);		
	}

	@Test
	public void example2() {
		int[] nums = {1,2,3,-4,6,-5,-1};
		int[][] triplets = {
				{-4, 1, 3},
				{-5, 2, 3},
				{-5, -1, 6}
		};
		check(nums, triplets);		
	}
	
	@Test
	public void allZeroes() {
		int[] nums = {0,0,0};
		int[][] triplets = {
				{0, 0, 0}	
		};
		check(nums, triplets);		
	}
	
	@Test
	public void onlyThree() {
		int[] nums = {-1,0,1};
		int[][] triplets = {
				{-1, 0, 1}	
		};
		check(nums, triplets);		
	}

	@Test 
	public void onlyThreeOpposite() {
		int[] nums = {1,0,-1};
		int[][] triplets = {
				{-1, 0, 1}	
		};
		check(nums, triplets);		
	}
	
	@Test 
	public void duplicates() {
		int[] nums = {1,2,-2,-1};
		int[][] triplets = {};
		check(nums, triplets);		
	}
	
	public void check(int[] nums, int[][]triplets) {
		List<List<Integer>> result = ts.threeSum(nums);
		List<List<Integer>> expected = new ArrayList<>();
		
		for(int[] t : triplets){
			List<Integer> temp = new ArrayList<>();
			expected.add(temp);
			for(int y = 0; y < t.length; y++){
				temp.add(t[y]);
			}
			Collections.sort(temp);
		}
		
		//List<List<Integer>> expectedSorted = expected.stream().sorted().collect(Collectors.toList());
		//List<List<Integer>> resultSorted = result.stream().sorted().collect(Collectors.toList());
		assertTrue("Result not equal to expected! " + expected + " != " + result,
				expected.equals(result));
	}
}
