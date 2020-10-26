package com.example.datastructure.howtoapply.e_sort;

/**
 * *****************************************************************************
 * Shortest unordered Subarray
 * *****************************************************************************
 * An array is given of n length, and problem is that 
 * we have to find the length of shortest unordered {neither increasing nor decreasing} sub array in given array.
 * *****************************************************************************
 * I/P: n = 5
 *      7 9 10 8 11
 * O/P: 3				//9 10 8 unordered sub array
 * 
 * I/P: n = 5
 *      1 2 3 4 5
 * O/P: 0				//Array is in increasing order
 * 
 * *****************************************************************************
 */

public class F10_sortestUnorderedSubArray {
	/*
	 * The idea is based on the fact that size of shortest subarray would be either 0 or 3.
	 * We have to check array element is either increasing or decreasing
	 *  - if all array elements are in increasing or decreasing, then length of shortest sub array is 0
	 *  - if either the array element is not follow the increasing or decreasing then it shortest length is 3
	 * 
	 */
}
