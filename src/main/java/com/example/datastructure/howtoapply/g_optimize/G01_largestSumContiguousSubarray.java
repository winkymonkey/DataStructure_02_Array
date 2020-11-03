package com.example.datastructure.howtoapply.g_optimize;

/**
 * *****************************************************************************
 * Largest Sum Contiguous Sub-Array
 * *****************************************************************************
 * Input:  {-2, -3, 4, -1, -2, 1, 5, -3}
 * index     0   1  2   3   4  5  6   7
 * 
 * Output: 7								//sum of elements in {4, -1, -2, 1, 5} is 7
 * 
 * *****************************************************************************
 */

public class G01_largestSumContiguousSubarray {
	/*
	 * ------------------------
	 * ---KADANE'S ALGORITHM---
	 * ------------------------
	 * The idea is to look for all positive contiguous segments of the array (using 'sum')
	 * And keep track of maximum sum contiguous segment among all positive segments (using 'max')
	 * Each time we get a positive sum compare it with 'max' and update 'max' if it is greater than 'max'
	 * 
	 * 
	 * MAX = Integer.MIN;
	 * sum = 0;
	 * for (i=0 to length) {
	 * 	  sum = sum + A[i]
	 *    
	 *    if (sum < 0)
	 *       sum = 0;
	 *    
	 *    if (sum > MAX)
	 *       MAX = sum;
	 * }
	 * return MAX;
	 * 
	 * 
	 * for i=0	-->	sum = sum+A[0] = 0+(-2) = -2 ~~ 0	// max=0
	 * for i=1	-->	sum = sum+A[1] = 0+(-3) = -3 ~~ 0 	// max=0
	 * for i=2	-->	sum = sum+A[2] = 0+(4)  = 4			// max=4 (as sum is bigger than max) 
	 * for i=3	-->	sum = sum+A[3] = 4+(-1) = 3			// max=4
	 * for i=4	-->	sum = sum+A[4] = 3+(-2) = 1			// max=4
	 * for i=5	-->	sum = sum+A[5] = 1+(1)  = 2			// max=4
	 * for i=6	-->	sum = sum+A[6] = 2+(5)  = 7			// max=7 (as sum is bigger than max)
	 * for i=7	-->	sum = sum+A[7] = 7+(-3) = 4			// max=7
	 * 
	 */
}
