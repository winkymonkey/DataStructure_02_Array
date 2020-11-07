package com.example.datastructure.g_sort;

/**
 * ******************************************************************************************
 * Sort an array according to absolute difference with given value.
 * ******************************************************************************************
 * Given an array of n distinct elements and a number x, arrange array elements according to the absolute difference with x.
 * (i.e. element having minimum difference comes first and so on)
 * Note : If two or more elements are at equal distance, arrange them in same sequence as in the given array.
 * ******************************************************************************************
 * Input:  A[] = {10, 5, 3, 9, 2}		x = 7
 * Output: A[] = {5, 9, 10, 3, 2}
 * 
 * Input:  A[] = {1, 2, 3, 4, 5} 		x = 6
 * Output: A[] = {5, 4, 3, 2, 1}
 * 
 * Input:  A[] = {2, 6, 8, 3}			x = 5
 * Output: A[] = {6, 3, 2, 8}
 * 
 * ******************************************************************************************
 */

public class G05_sortAccordingToAbsoluteDiff {
	/*
	 * Modified Merge Sort
	 * 		In its merge(A, l, m, r) method, merge two arrays as per its difference with the given KEY
	 */
}