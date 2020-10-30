package com.example.datastructure.howtoapply.aa_search;

/**
 * *****************************************************************************
 * Given an array A[] and a number X, check for pair in A[] with sum as SUM
 * *****************************************************************************
 * I/P: 1, 4, 45, 6, 10, -8		SUM=16
 * O/P: YES						//10+6
 * 
 * *****************************************************************************
 */

public class AA01_findPair_ofGivenSum {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for (i=0 to n-2)
	 *    for (j=i+1 to n-1)
	 *       if ( A[i] + A[j] == SUM )
	 *          return true
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array	{-8, 1, 4, 6, 10, 45}
	 * 
	 * l = 0
	 * r = n-1
	 * while (l < r) {
	 * 	  if ( A[l]+A[r] == SUM )
	 *       return true;
	 * 	  else if ( A[l]+A[r] < SUM )
	 *       l++
	 * 	  else if ( A[l]+A[r] > SUM )
	 *       r--
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 * 	  if (HASHMAP.contains(SUM-A[i]))
	 *       //the pair is A[i] and SUM-A[i]
	 * 	  else
	 *       HASHMAP.put(A[i], 999999)
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
}
