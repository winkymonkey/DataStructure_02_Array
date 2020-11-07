package com.example.datastructure.d_search;

/**
 * *****************************************************************************
 * Leaders in an array
 * *****************************************************************************
 * An element is leader if it is greater than all the elements to its right side. 
 * Note that the rightmost element is always a leader.
 * 
 * *****************************************************************************
 * Input:  {16, 17, 4, 3, 5, 2}
 * Output: 17, 5, 2
 * 
 * *****************************************************************************
 */

public class D03_findLeader {
	/*
	 * Scan all the elements from right to left in array and keep track of maximum till now.
	 * When maximum changes it's value, print it.
	 * 
	 * 
	 * MAX = A[n-1];
	 * print MAX;
	 * for (i=n-2 to 0) {			//scans from 2nd last element
	 * 	  if (A[i] > MAX) {
	 * 	     MAX = A[i];
	 *       print MAX;
	 * 	  }
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
