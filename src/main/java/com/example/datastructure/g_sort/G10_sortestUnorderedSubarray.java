package com.example.datastructure.g_sort;

/**
 * *****************************************************************************
 * Shortest unordered Subarray
 * *****************************************************************************
 * An array is given of n length,
 * find the length of shortest unordered (neither increasing nor decreasing) sub array in given array.
 * *****************************************************************************
 * Input:  7 9 10 8 11
 * Output: 3				//9 10 8 unordered sub array
 * 
 * Input:  1 2 3 4 5
 * Output: 0				//Array is already in sorted
 * 
 * *****************************************************************************
 */

public class G10_sortestUnorderedSubarray {
	/*
	 * If we closely monitor, we can say that the size of shortest subarray can be either 0 or 3
	 * because if it's 2 -- it will obviously be either increasing or decreasing
	 * and if it's 4 or5 or 6 or ... -- it will contain a few elements that is either increasing or decreasing
	 * 
	 * Hence
	 *  - if all array elements are in increasing or decreasing --> then the length of shortest subarray is 0
	 *  - if any the array element is not in increasing or decreasing --> then the length of shortest subarray is 3
	 * 
	 */
}
