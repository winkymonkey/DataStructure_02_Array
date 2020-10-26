package com.example.datastructure.howtoapply.aa_search;

/**
 * *****************************************************************************
 * Given a sorted array and a number X, find the pair in array whose sum is closest to X
 * *****************************************************************************
 * I/P: A[] = {10, 22, 28, 29, 30, 40}		X = 54
 * O/P: 22 and 30
 * 
 * I/P: A[] = {1, 3, 4, 7, 10}				X = 15
 * O/P: 4 and 10
 * 
 * *****************************************************************************
 */
public class AA03_findPair_whoseSumIsClosestToGivenValue {
	/*
	 * ----------------------------
	 * ---SLIDING DOOR TECHNIQUE---
	 * ----------------------------
	 * DIFF
	 * res_l
	 * res_r
	 * 
	 * l = 0
	 * r = n-1
	 * while(l < r) {
	 * 	  if( abs(A[l]+A[r]-X) < DIFF ) {
	 *       res_l = l;
	 *       res_r = r;
	 *       DIFF = Math.abs(A[l] + A[r] - X); 
	 * 	  }
	 *    
	 *    if( A[l]+A[r] < X )
	 *       l++
	 *    else
	 *       r++
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
