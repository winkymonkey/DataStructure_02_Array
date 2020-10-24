package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Find a peak element
 * *****************************************************************************
 * In an array, an element is a peak if it's NOT smaller than its neighbors.
 * For corner elements, we need to consider only one neighbor.
 * *****************************************************************************
 * I/P: {5, 10, 20, 15}
 * O/P: 20
 * 
 * I/P: {10, 20, 15, 2, 23, 90, 67}
 * O/P: 20, 90
 * 
 * I/P: {10, 20, 15, 2, 23, 90, 67}
 * O/P: 20, 90
 * 
 * I/P: {10, 20, 30, 40, 50}
 * O/P: 50
 * 
 * I/P: {100, 80, 60, 50, 20}
 * O/P: 100
 * 
 * I/P: {10, 10, 10, 10, 10}
 * O/P: all 10s
 * 
 * *****************************************************************************
 */
public class A07_findPeakElement {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array (linear search).
	 * Compare A[i] with neighbors.  
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * ---------------------
	 * ---TRICKY APPROACH---
	 * ---------------------
	 * mid = (start+end)/2
	 * Start from A[mid]
	 * 
	 * if(A[mid] >= neighbors)
	 * 	  return;
	 * if(A[mid] < left neighbor)
	 * 	  //there is always a peak in left half
	 * 	  //recursively call the function for left half
	 * if(A[mid] < right neighbor)
	 * 	  //there is always a peak in right half
	 * 	  //recursively call the function for right half
	 * 
	 * TIME --- O(log n)
	 * SPACE -- O(log n)
	 */
}
