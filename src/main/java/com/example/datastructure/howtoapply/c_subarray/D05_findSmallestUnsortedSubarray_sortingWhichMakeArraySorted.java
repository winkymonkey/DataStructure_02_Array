package com.example.datastructure.howtoapply.c_subarray;

/**
 * *****************************************************************************
 * Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
 * *****************************************************************************
 * I/P: [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60]
 * O/P: 3 to 8
 * 
 * I/P: [0, 1, 15, 25, 6, 7, 30, 40, 50]
 * O/P: 2 to 5
 * 
 * *****************************************************************************
 */
public class D05_findSmallestUnsortedSubarray_sortingWhichMakeArraySorted {
	/*
	 * In an increasing sorted array, each element is greater than its previous & smaller than its next. 
	 * for(i=0 to n-2)
	 * 	 find the index where current element is NOT SMALLER than its next
	 *   mark it as S
	 * for(i=n-1 to 1)
	 *   find the index where current element is NOT GREATER than its previous
	 *   mark it as E
	 * 
	 * Sort A[S...E] to find MAX and MIN from there.
	 * 
	 * Find the first element (if any) in A[0....S-1] which is greater than MIN.
	 * Change S to index of this element.
	 * 
	 * Find the last element (if any) in A[E+1....n-1] which is smaller than MAX.
	 * Change E to index of this element.
	 * 
	 * Print S, E
	 * 
	 */
}
