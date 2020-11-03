package com.example.datastructure.howtoapply.g_optimize;

/**
 * *****************************************************************************
 * Find the subarray with least average
 * *****************************************************************************
 * Input:  A[] = {3, 7, 90, 20, 10, 50, 40}			k = 3
 * Output: between indexes 3 and 5	-- {20,10,50}
 * 
 * Input:  A[] = {3, 7, 5, 20, -10, 0, 12}			k = 2
 * Output: between indexes 4 and 5	-- {-10,0}
 * 
 * *****************************************************************************
 */

public class G03_findSubarray_withLeastAverage {
	/*
	 * result_index = 0
	 * curr_sum = 0;
	 * for (i=0 to k)
	 * 	  sum += A[i];
	 * 
	 * min_sum = sum;
	 * 
	 * for (i=k to n) {
	 * 	  sum += A[i] - A[i-k];		//Add current item and remove first item of previous subarray
	 * 	  if (sum < min_sum) {
	 *       min_sum = sum;
	 *       res_index = (i+1)-k;
	 * 	  }
	 * }
	 * 
	 */
}
