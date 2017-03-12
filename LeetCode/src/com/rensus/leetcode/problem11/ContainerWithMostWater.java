package com.rensus.leetcode.problem11;

import java.util.Arrays;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 * 
 * @author resnus
 *
 */
public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {
		if(height == null || height.length < 2){
			return 0; // Edge case
		}
		
		int maxArea = 0;
		int previousValA = 0;
		
		for(int i = 0; i < height.length-1; i++){
			int valA = height[i];
			// If value is declining continue to next
			if(valA < previousValA) continue;
			for(int y = height.length-1; y > i; y-- ){
				int valB = height[y];
				int minHeight = Math.min(valA, valB);
				int area = (y - i) * minHeight;
				//System.out.println("[" + i + "," + y + "]" + "Area: " + area);
				maxArea = Math.max(area, maxArea);
				// If the second bound is same height - this is MAX value
				if(minHeight == valA) break;
			}
			previousValA = valA;
		}
		
		return maxArea;
	}
}
