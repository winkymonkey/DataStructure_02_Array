package com.example.datastructure.howtoapply.e_arrangement;

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
 *  
 * *******************************************************************************************************
 * Input:  A[] = {2, 1, 5, 6, 3}	K=3
 * Output: 1
 * after swaps-> {2, 1, 3, 6, 5}	//5,3 swapped
 * 
 * Input:  A[] = {2, 7, 9, 5, 8, 7, 4}		K=5
 * Output: 2
 * after swaps-> {9, 7, 2, 5, 4, 7, 8}		//2,9 swapped 8,4 swapped
 * 
 * *******************************************************************************************************
 */

public class E05_minimumSwapsToBringElementsLessOrEqualsToK {
	/*
	 * --------------------------------
	 * --Two Pointer & Sliding Window--
	 * --------------------------------
	 * Find count of all elements which are less than or equals to 'K'
	 * Let’s say the count is 'count'
	 * 
	 * For window of length 'count', each time keep track of how many elements in this range are greater than 'K'
	 * Let’s say the total count is 'bad'
	 * 
	 * Repeat step 2, for every window of length 'count' and take minimum of count 'bad' among them
	 * This will be the final answer
	 * 
	 */
	
	
	public static void main(String args[]) {
		//         <        <        <  <        <  <  <  <     <           which are less than K
		int A[] = {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7};
		//		   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17
		//         |                       |								5 elements are greater than K in the given range
		//            |                       |								6 elements are greater than K in the given range
		//               |                       |							5 elements are greater than K in the given range
		//                  |                       |						4 elements are greater than K in the given range
		//                     |                       |					4 elements are greater than K in the given range
		//                        |                       |					3 elements are greater than K in the given range
		//                           |                       |				3 elements are greater than K in the given range
		//                              |                       |			3 elements are greater than K in the given range
		//                                 |                       |		4 elements are greater than K in the given range
		//                                    |                       |		4 elements are greater than K in the given range
		
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
