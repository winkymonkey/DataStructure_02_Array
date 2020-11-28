package com.example.datastructure.e_rotation;

/**
 * *****************************************************************************
 * Given a sorted and rotated array, find if there is a pair with a given sum
 * *****************************************************************************
 * Input:  {11, 15, 6, 8, 9, 10}		SUM=16
 * Output: true
 * 
 * Input:  {11, 15, 26, 38, 9, 10} 		SUM=45
 * Output: false
 * 
 * *****************************************************************************
 */

public class E05_sortedRotated_findPairOfGivenSum {
	/*
	 * We already know how to solve such problems (using sliding door technique) if it's a regular sorted array
	 * We can extend that solution here
	 * 
	 * Find the pivot element in O(Logn) time ---> It is the Largest
	 * The number next to largest ---> It is the Smallest
	 * 
	 * Now consider Smallest as Left and Largest as Right
	 * Now apply sliding door technique
	 * But here the indexes are incremented and decremented in rotational manner using modular arithmetic
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
