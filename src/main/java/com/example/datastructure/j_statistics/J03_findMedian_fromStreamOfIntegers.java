package com.example.datastructure.j_statistics;

/**
 * *****************************************************************************
 * Median in a stream of integers (running integers)
 * *****************************************************************************
 * Median means ---
 *   if the input size is odd --- Median = middle element of sorted stream
 *   if the input size is even -- Median = average of two middle elements of sorted stream
 * 
 * Example:
 * A Stream of 5, 15, 1, 3
 * 		After reading 1st element of stream -- 5           -> median -- 5
 * 		After reading 2nd element of stream -- 5, 15       -> median -- 10
 * 		After reading 3rd element of stream -- 5, 15, 1    -> median -- 5
 * 		After reading 4th element of stream -- 5, 15, 1, 3 -> median -- 4
 * 
 * *****************************************************************************
 */

public class J03_findMedian_fromStreamOfIntegers {
	/*
	 * --------------------
	 * ---INSERTION SORT---
	 * --------------------
	 * If we can sort the data as it appears, we can easily locate median element by accessing the middle element(s) of the array 
	 * Insertion Sort is one such algorithm that sorts the data appeared so far.
	 *  -- i.e. after sorting i'th element, the first i elements of array are sorted.
	 *  That's why Insertion sort is also called ONLINE SORTING ALGORITHM
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ----------------
	 * ---USING HEAP---
	 * ----------------
	 * Refer to HEAP
	 * 
	 */
}
