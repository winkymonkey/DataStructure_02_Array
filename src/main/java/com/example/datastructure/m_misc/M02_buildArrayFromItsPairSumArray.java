package com.example.datastructure.m_misc;

/**
 * *****************************************************************************
 * Construct an array from its pair-sum array
 * *****************************************************************************
 * A pair-sum array for an array is the array that contains sum of all pairs in ordered form.
 *  - for an array --------- {6,8,3,4}
 *  - pair sum array ------- {14,9,10,11,12,7}
 * 
 * Given a pair-sum array and size of the original array (n), construct the original array.
 * *****************************************************************************
 * Input:  {14, 9, 10, 11, 12, 7}					n = 4
 * Output: {6, 8, 3, 4}
 * 
 * Input:  {15, 13, 11, 10, 12, 10, 9, 8, 7, 5}		n = 5
 * Output: {8, 7, 5, 3, 2}
 * 
 * *****************************************************************************
 */

public class M02_buildArrayFromItsPairSumArray {
	/*
	 * Let us take an example of 
	 * A[] =    {6, 8, 3, 4}		n=4
	 *           0  1  2  3
	 * 
	 * PAIR[] = {14,  9,   10,  11,  12,  7}
	 *           0+1  0+2  0+3  1+2  1+3  2+3
	 * 
	 * 
	 * We can make a simple observation and say that
	 * 		A[0] = (PAIR[0] + PAIR[1] - PAIR[n-1]) / 2
	 *           = 14 + 9 - 11 / 2
	 *           = 6
	 * 
	 * Once we have evaluated A[0], we can evaluate other elements as below
	 * 		A[1] = PAIR[0] - A[0]
	 * 		A[2] = PAIR[1] - A[0]
	 * 		A[3] = PAIR[2] - A[0]
	 * 		.....
	 * 		.....
	 * 
	 * -----------
	 * A[0] = (PAIR[0] + PAIR[1] - PAIR[n-1]) / 2;
	 * for (i=0 to n) {
	 *    A[i] = PAIR[i-1] - A[0]
	 * }
	 * 
	 */
}
