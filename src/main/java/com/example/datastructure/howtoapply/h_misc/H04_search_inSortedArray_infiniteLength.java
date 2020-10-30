package com.example.datastructure.howtoapply.h_misc;

/**
 * *****************************************************************************
 * Find position of an element in a sorted array of infinite numbers
 * *****************************************************************************
 */
public class H04_search_inSortedArray_infiniteLength {
	/*
	 * Since array is sorted, the first thing clicks into mind is binary search.
	 * But the problem here is that we don't know size of array.
	 * So we don't have proper bounds to apply binary search.
	 * 
	 * So in order to find position of X,
	 * 	first we find bounds cleverly and then apply binary search algorithm.
	 * 
	 * ------------------
	 * low = 0
	 * high = 1
	 * 
	 * FUNC(low, high) {
	 *    if (X == A[high]) {
	 * 	     //return
	 *    }
	 *    else if (X > A[high]) {
	 * 	     high = high*2
	 * 	     low = high
	 *       FUNC(low, high);
	 *    }
	 *    else {
	 * 	     //apply binary search between indices 'low' and 'high'
	 *    }
	 * }
	 * 
	 */
}
