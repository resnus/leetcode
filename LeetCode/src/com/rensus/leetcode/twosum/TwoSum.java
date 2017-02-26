package com.rensus.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * @author resnus
 *
 */
public class TwoSum {

	public static int[] nums = {2, 7, 11, 15};
	public static int target = 9;
	
	public static void main(String[] args) {

		TwoSum ts = new TwoSum();
		int[] tuple = ts.twoSum(nums, target);
		System.out.println(tuple[0] + ":" + tuple[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> cache = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
				int diff = target - nums[i];
				if(cache.containsKey(diff))
					return new int[]{cache.get(diff), i};
				else cache.put(nums[i], i);
			//System.out.println(nums[i]);
		}
		return null;
	}
}

/*
SOLUTION

Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");

*/