package com.example.datastructure.howtoapply.c_arrangement;

/**
 * *******************************************************************************************************
 * Reorder an array according to given indexes
 * *******************************************************************************************************
 * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array.
 * It is not allowed to given array arr’s length.
 * *******************************************************************************************************
 * Input:	A[]     = [10, 11, 12];
 * 			index[] = [1, 0, 2];
 * Output: 	A[]     = [11, 10, 12]
 * 			index[] = [0,  1,  2]
 * 
 * Input:  	A[]     = [50, 40, 70, 60, 90]
 * 			index[] = [3,  0,  4,  1,  2]
 * Output: 	A[]     = [40, 60, 90, 50, 70]
 * 			index[] = [0,  1,  2,  3,   4]
 * 
 * *******************************************************************************************************
 * 
 */

public class C07_reorderAccordingToGivenIndex {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Take an auxiliary array temp[] of same size as A[]
	 * Traverse the A[] and put all elements at their correct place in temp[] using index[]
	 * Finally copy temp[] to A[] and set all values of index[i] as i
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT SOLUTION---
	 * ------------------------
	 * Sort the index[] in such a way that whenever you swap the index[] data you also swap the A[] data 
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(n)
	 * 
	 */
	
}
