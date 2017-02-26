package com.rensus.leetcode.mediantwosortedarrays;

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class MedianTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,2,2};
		int[] nums2 = {2,2,2,2};
		// {1,3,4,5,6,8,9,17} median = 5+6/2  = 11 / 2
		MedianTwoSortedArrays med = new MedianTwoSortedArrays();
		double median = med.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);
	}

	public double findMedianSortedArrays(int[] a, int[] b) {
		int size = a.length + b.length;
		if(size == 0) return 0d;
		if(a.length == 0) a = new int[] {Integer.MAX_VALUE};
		if(b.length == 0) b = new int[] {Integer.MAX_VALUE};
		
		int indexA = 0;
		int	indexB = 0;
		double median = 0d;
		
		boolean isEven = size%2 == 0;
		// Is odd or even number of elements
		size = size/2;
		if(isEven) size -= 1;
		
		while(indexA + indexB <= size){
			if(indexA == a.length){
				median = b[indexB];
				indexB++;
			}else if(indexB == b.length){
				median = a[indexA];
				indexA++;
			}else{
				median = (a[indexA] <= b[indexB]) ? a[indexA++]:  b[indexB++];
			}
		}

		//System.out.println("isEven indexA:" + indexA + " indexB:" + indexB + " median:" + median );
		if(isEven){
			if(indexA == a.length)
				median += b[indexB];
			else if(indexB == b.length)
				median += a[indexA];
			else
				median += (a[indexA] <= b[indexB]) ? a[indexA]:  b[indexB];
			median /= 2d;
		}
		
		return median;
	}
}
