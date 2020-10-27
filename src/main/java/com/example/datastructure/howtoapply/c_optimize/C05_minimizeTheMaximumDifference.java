package com.example.datastructure.howtoapply.c_optimize;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Minimize the maximum difference between the heights
 * *****************************************************************************
 * Given heights of n towers and a value k.
 * We need to either increase or decrease height of every tower by k (only once) where k > 0.
 * The task is to minimize the difference between the heights of the longest & shortest tower after modifications, 
 * and output this difference.
 * *****************************************************************************
 * I/P: A[]={1, 15, 10}
 * 		k = 6
 * O/P: Maximum difference is 5			//after change--{6, 9, 4}
 * 
 * 
 * I/P: A[] = {1, 5, 15, 10} 
 * 		k = 3
 * O/P: Maximum difference is 8			//after change--{4, 8, 12, 7}
 * 
 * 
 * I/P: A[] = {1, 15, 10}
 * 		k = 6
 * O/P: Maximum difference is 5			//after change--{6, 9, 4}
 * 
 * 
 * I/P: A[] = {4, 6}
 * 		k = 10
 * O/P: Maximum difference is 2			//after change--{14, 16} OR {-6, -4}
 * 
 * 
 * I/P: A[] = {6, 10}
 * 		k = 3
 * O/P: Maximum difference is 5			//after change--{9, 7}
 * 
 * 
 * I/P: A[] = {1, 10, 14, 14, 14, 15}
 * 		k = 6
 * O/P: Maximum difference is 5			//after change--{7, 4, 8, 8, 8, 9}
 * 
 * 
 * I/P: A[] = {1, 2, 3}
 * 		k = 2
 * O/P: Maximum difference is 2			//after change--{3, 4, 5}
 * 
 * *****************************************************************************
 */

public class C05_minimizeTheMaximumDifference {
	
	public static void main(String[] args) {
		int arr[] = {1, 10, 14, 14, 14, 15};
		int k = 6;
		System.out.println("Maximum difference is " + getMinDiff(arr, k));
	}
	
	
	// Modifies the array by subtracting/adding 'k' to every element 
	// such that the difference between maximum and minimum is minimized
	private static int getMinDiff(int A[], int k) {
		int n = A.length;
		if (n == 1)
			return 0;
		
		Arrays.sort(A);
		
		int ans = A[n-1] - A[0];
		
		// Handle corner elements
		int small = A[0] + k;
		int big = A[n-1] - k;
		if (small > big) {
			//swap small and big
			int temp = small;
			small = big;
			big = temp;
		}
		
		// Traverse middle elements
		for (int i=1; i<n-1; i++) {
			int subtract = A[i] - k;
			int add = A[i] + k;

			// If 'small' is smaller than 'A[i]-k' OR 'big' is bigger than 'A[i]+k' --- nothing to do
			if(small <= subtract || add <= big) 
				continue;

			// If the difference between ('big' & 'A[i]-k') is lesser then the difference between ('A[i]+k' and 'small')
			// then declare 'A[i]-k' as the new 'small'
			// otherwise declare 'A[i]+k' as the new 'big'
			if (big - subtract <= add - small)
				small = subtract;
			else
				big = add;
		}
		
		return Math.min(ans, big-small);
	}
}
