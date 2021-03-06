package com.example.datastructure.d_search;

/**
 * *****************************************************************************
 * Searching in an array where adjacent differ by at most k
 * *****************************************************************************
 * It's an array of integers where each element has a difference of at-most 'K' with its neighbor
 * Given a key ELEM, we need to find the index value of ELEM
 * If ELEM occurs multiple times, return the first occurrence of ELEM
 * *****************************************************************************
 * Input:  4, 5, 6, 7, 6					K=1		ELEM=6
 * Output: 2								//ELEM=6 occurs at index=2
 * 
 * Input:  40, 50, 40, 50, 60, 80, 60		K=20	ELEM=80
 * Output: 5								//ELEM=80 occurs at index=5
 * 
 * *****************************************************************************
 */

public class D01_findElement_whereAdjacentDiffersAtMostByK {
	/*
	 * ----------------------
	 * ---OPTIMAL SOLUTION---
	 * ----------------------
	 * Instead of doing linear search,
	 * we can utilize the property which says the adjacent elements can differ at most by K
	 *  
	 * i = 0;
	 * while (i<length) {
	 *    if (A[i]==ELEM) {
	 *       //return
	 * 	  }
	 * 	  else {
	 *       //From the special property of this array, we can say that ELEM must be atleast 'DIFF/K' away.
	 *       //Hence, instead of searching one-by-one, we can jump 'DIFF/K'.
	 *       DIFF = ELEM - A[i];
	 *       i = i + (DIFF/K);
	 * 	  }
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
