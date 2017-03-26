package com.rensus.leetcode.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 * @author resnus
 *
 */
public class ThreeSum {

	public static void main(String[] args) {

	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length < 3){
			return result; // Edge case
		}
		
		Arrays.sort(nums); // Sort the array
		for(int i = 0; i < nums.length-2; i++){
			
		}
		
		return result;
	}
	
	
	/*
	 Correct but timeout
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length < 3) return result;
		
		List<Integer> values = new ArrayList<>();
		Arrays.stream(nums).forEach(values::add);
		
		for (int x = 0; x <= nums.length-1; x++) {
			for (int y = x + 1; y < nums.length; y++) {
				int sum = nums[x] + nums[y];
				int index = values.lastIndexOf(-sum);
				if(index > 0 && index > x && index != y){
					List<Integer> triplet = new ArrayList<>();
					triplet.add(nums[x]);
					triplet.add(nums[y]);
					triplet.add(values.get(index));
					Collections.sort(triplet);
					if(!result.contains(triplet)){
						System.out.println(triplet);
						result.add(triplet);
					}
				}
			}
		}
		return result;
	} */

}
