package com.example.datastructure.f_arrangement;

/**
 * *******************************************************************************************************
 * Minimum swaps required to bring all elements less than or equal to k together
 * *******************************************************************************************************
 * Given an array of n positive integers and a number K
 * Find the minimum number of swaps required to bring all the numbers less than or equal to K together
 * 
 * NOTE:
 * It is not asked to bring all such elements at the beginning of the array.
 * Those elements can be brought together anywhere within the array (i.e. can be brought together at start/middle/end/anywhere)
 * *******************************************************************************************************
 * Input:  {2, 1, 5, 6, 3}				K=3
 * Output: 1							//5,3 swapped	{2, 1, 3, 6, 5}
 * 														 <  <  <
 * 
 * Input:  {2, 7, 9, 5, 8, 7, 4}		K=5
 * Output: 2							//2,9 swapped 8,4 swapped	{9, 7, 2, 5, 4, 7, 8}
 * 																	       <  <  <
 * *******************************************************************************************************
 */

public class F05_minimumSwapsToBringElementsLessOrEqualsToK {
	/*
	 * --------------------------------
	 * --Two Pointer & Sliding Window--
	 * --------------------------------
	 * Traverse the array and find count of all elements which are less than or equals to 'K'
	 * 
	 * Traverse the array again by maintaining a window of length 'count'
	 *  - in each step, keep track of how many elements in this range are greater than 'K'. Let it be called as 'BAD'
	 *  - it is nothing but the number of swaps required for this range
	 *  - so after each step, we must compare the current value of 'BAD' and the minimum of 'BAD' tracked till now
	 * 
	 * Example:
	 *  <        <        <  <        <  <  <  <     <           --- which are less than K
	 * {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7}
	 *  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17
	 *  |                       |								5 elements are greater than K in this range. So 5 swaps are required in this range.
	 *     |                       |							6 elements are greater than K in this range. So 6 swaps are required in this range.
	 *        |                       |							5 elements are greater than K in this range. So 5 swaps are required in this range.
	 *           |                       |						4 elements are greater than K in this range. So 4 swaps are required in this range.
	 *              |                       |					4 elements are greater than K in this range. So 4 swaps are required in this range.
	 *                 |                       |				3 elements are greater than K in this range. So 3 swaps are required in this range.
	 *                    |                       |				3 elements are greater than K in this range. So 3 swaps are required in this range.
	 *                       |                       |			3 elements are greater than K in this range. So 3 swaps are required in this range.
	 *                          |                       |		4 elements are greater than K in this range. So 4 swaps are required in this range.
	 *                             |                       |	4 elements are greater than K in this range. So 4 swaps are required in this range.
	 * 
	 * 															So minimum of all above is --- 3 swaps
	 * 
	 */
	
	public static void main(String args[]) {
		int A[] = {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7};
		
		int K = 5;
		minSwaps(A, K);
	}
	
	private static void minSwaps(int A[], int K) {
		int count = 0; 						//number of elements less than or equals to 'K'
	    for (int i=0; i<A.length; ++i) 
	    if (A[i] <= K) 
	        count++;
	    
	    int bad = 0;						//unwanted elements in current window of size 'count' 
	    for (int i=0; i<count; i++) 
	    	if (A[i] > K) 
	    		bad++;
	    
	    int ans = bad;
	    for (int i=0, j=count; j<A.length; ++i, ++j) {
	        if (A[i] > K)
	            bad--;
	        if (A[j] > K)
	            bad++;
	        ans = Math.min(ans, bad);
	    }
	    System.out.println(ans);
	}
		
}
