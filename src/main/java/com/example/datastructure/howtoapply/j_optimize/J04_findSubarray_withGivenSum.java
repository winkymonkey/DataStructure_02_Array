package com.example.datastructure.howtoapply.j_optimize;

/**
 * *****************************************************************************
 * Find subarray with given sum | Set 1 (Nonnegative Numbers)
 * *****************************************************************************
 * Input:  A[] = {1, 4, 20, 3, 10, 5} 		SUM = 33
 * Output: Sum found between indexes 2 and 4
 * 
 * Input:  A[] = {1, 4, 0, 0, 3, 10, 5} 	SUM = 7
 * Output: Sum found between indexes 1 and 4
 * 
 * Input:  A[] = {1, 4}						SUM = 0
 * Output: No subarray found
 * 
 * *****************************************************************************
 */

public class J04_findSubarray_withGivenSum {
	/*
	 * A[] --> 1, 4, 20, 3, 10, 5		SUM=33
	 * 
	 * step-1:
	 * [1], 4, 20, 3, 10, 5
	 * ==> sum_of_bound=[1]			< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-2:
	 * [1, 4], 20, 3, 10, 5
	 * ==> sum_of_bound=[1+4]=5		< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-3:
	 * [1, 4, 20], 3, 10, 5
	 * ==> sum_of_bound=[1+4+20]=25			< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-4:
	 * [1, 4, 20, 3], 10, 5
	 * ==> sum_of_bound=[1+4+20+3]=28		< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-5:
	 * [1, 4, 20, 3, 10], 5
	 * ==> sum_of_bound=[1+4+20+3+10]=38	> SUM
	 * ==> decrease right bound
	 * ==> increase left bound
	 * 
	 * 
	 * step-6:
	 * 1, [4, 20, 3], 10, 5
	 * ==> sum_of_bound=[4+20+3]=27			< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-7:
	 * 1, [4, 20, 3, 10], 5
	 * ==> sum_of_bound=[4+20+3+10]=37		> SUM
	 * ==> decrease right bound
	 * ==> increase left bound
	 * 
	 * 
	 * step-8:
	 * 1, 4, [20, 3], 10, 5
	 * ==> sum_of_bound=[20+3]=23		< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-9:
	 * 1, 4, [20, 3, 10], 5
	 * ==> sum_of_bound=[20+3+10]=33		= SUM
	 * print the BOUND
	 * 
	 */
}
