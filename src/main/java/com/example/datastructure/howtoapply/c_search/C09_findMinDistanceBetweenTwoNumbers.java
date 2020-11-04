package com.example.datastructure.howtoapply.c_search;
/**
 * *****************************************************************************
 * Find the minimum distance between two numbers
 * *****************************************************************************
 * Given an unsorted array A[] and two numbers X and Y.
 * Find the minimum distance between X and Y in A[].
 * The array might also contain duplicates.
 * You may assume that both X and Y are different and present in A[].
 * *****************************************************************************
 * Input:  A[]={1, 2}		 	X=1, Y=2
 * Output: 1
 * 
 * Input:  A[]={3, 4, 5}		X=3, Y=5
 * Output: 2
 * 
 * Input:  A[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}		X=3, Y=6
 * Output: 4
 * 
 * Input:  A[] = {2, 5, 3, 5, 4, 4, 2, 3}					X=3, Y=2
 * Output: 1
 * 
 * Input:  A[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}		X=3, Y=6
 * Output: 1
 * 
 * *****************************************************************************
 */

public class C09_findMinDistanceBetweenTwoNumbers {
	/*
	 * Traverse the array
	 * If A[i] matches with either X or Y and different from A[p], then update the 'min_dist', update p as i
	 * If A[i] matches with either X or Y and same from A[p], update p as i
	 * 
	 * -----------
	 * p = -1
	 * min_dist = INT_MAX
	 * 
	 * for (i=0 to n-1) {
	 * 	  if (A[i] == X or Y) {
	 *       if (p!=-1 && A[i]!=A[p]) {
	 *          min_dist = min(min_dist, i-p)
	 *       }
	 *       p = i
	 * 	  }
	 * }
	 * 
	 * if (min_dist==INT_MAX)
	 *    //print "not found"
	 * else
	 *    //print min_dist
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
