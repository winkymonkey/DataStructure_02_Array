package com.example.datastructure.howtoapply.aa_search;

/**
 * *****************************************************************************
 * Two elements whose sum is closest to zero
 * *****************************************************************************
 * An Array of integers is given (both +ve and -ve)
 * You need to find the two elements such that their sum is closest to zero.
 * *****************************************************************************
 * I/P: {1, 60, -10, 70, -80, 85, -72}
 * O/P: -72 and 70
 * 
 * *****************************************************************************
 */

public class AA02_findPair_whoseSumIsClosestToZero {
	/*
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array		{-80, -72, 10, 1, 60, 70, 85}
	 * 
	 * min_sum = Integer.MAX
	 * min_l = 0
	 * min_r = n-1
	 * 
	 * l = 0
	 * r = n-1
	 * while (l < r) {
	 *    if (Math.abs(A[l]+A[r]) < Math.abs(min_sum)) {
	 *       min_sum = A[l]+A[r]
	 *       min_l = l
	 *       min_r = r
	 *    }
	 *    
	 *    if (A[l]+A[r] < 0)
	 *       l++
	 *    else
	 *       r--
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 */
}
