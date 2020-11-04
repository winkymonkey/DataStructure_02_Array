package com.example.datastructure.howtoapply.c_search;

/**
 * *****************************************************************************
 * Equilibrium index of an array
 * *****************************************************************************
 * Equilibrium index of an array is an index such that 
 * the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * *****************************************************************************
 * Input:  {-7 1 5 2 -4 3 0}
 * Output: 3					//A[0]+A[1]+A[2] = A[4]+A[5]+A[6]
 * 
 * *****************************************************************************
 */

public class C05_findEquilibriumIndex {
	/*
	 * ---------------
	 * ---USING SUM---
	 * ---------------
	 * SUM = find sum of all elements
	 * 
	 * LEFTSUM = 0
	 * for (i=0 to n-1) {
	 *    SUM = SUM - A[i]		//right sum for index i
	 * 	  
	 * 	  if (LEFTSUM == SUM)
	 *       return i
	 *    
	 *    LEFTSUM = LEFTSUM + A[i]
	 * }
	 * return -1
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
