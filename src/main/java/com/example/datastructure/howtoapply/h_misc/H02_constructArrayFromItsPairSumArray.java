package com.example.datastructure.howtoapply.h_misc;

/**
 * *****************************************************************************
 * Construct an array from its pair-sum array
 * *****************************************************************************
 * A pair-sum array for an array is the array that contains sum of all pairs in ordered form.
 *  - for an array --------- {6,8,3,4}
 *  - pair sum array is ---- {14,9,10,11,12,7}
 * 
 * Given a pair-sum array and size of the original array (N), construct the original array.
 * 
 * *****************************************************************************
 * I/P: {14, 9, 10, 11, 12, 7}					n = 4
 * O/P: {6, 8, 3, 4}
 * 
 * I/P: {15, 13, 11, 10, 12, 10, 9, 8, 7, 5}	n = 5
 * O/P: {8, 7, 5, 3, 2}
 * 
 * *****************************************************************************
 */
public class H02_constructArrayFromItsPairSumArray {
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
	 * 		A[0] = PAIR[0] + PAIR[1] - PAIR[n-1]
	 * 
	 * Once we have evaluated A[0], we can evaluate other elements by subtracting A[0]
	 * E.g,		A[1] = PAIR[0] - A[0]
	 * 			A[2] = PAIR[1] - A[0]
	 * 			A[3] = PAIR[2] - A[0]
	 * 			.....
	 * 			.....
	 * 
	 * -----------
	 * A[0] = (PAIR[0] + PAIR[1] - PAIR[n-1]) / 2;
	 * for (i=0 to n) {
	 *    A[i] = PAIR[i-1] - A[0]
	 * }
	 * 
	 */
}
