package com.example.datastructure.howtoapply.e_merge;

/**
 * *****************************************************************************
 * Find common elements in three sorted arrays
 * *****************************************************************************
 * I/P: A[] = {1, 5, 10, 20, 40, 80}
 * 		B[] = {6, 7, 20, 80, 100}
 * 		C[] = {3, 4, 15, 20, 30, 70, 80, 120}
 * O/P: 20, 80
 * 
 * *****************************************************************************
 */

public class E04_commonInThreeSubArray {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * find intersection of A[], B[]			//it's called IN1[]
	 * now find intersection of IN1[], C[]		//it's called IN2[]
	 * IN2[] is the answer
	 * 
	 * TIME --- O(n1+n2+n3)
	 * SPACE -- O(n1+n2+n3)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * i will traverse A[]
	 * j will traverse B[]
	 * k will traverse C[]
	 * 
	 * while (i<n1 && j<n2 && k<n3) {
	 * 	  if (A[i], B[j], C[k] are equal) {
	 * 	     return;
	 *    }
	 * 	  else {
	 * 	     find smallest of A[i], B[j], C[k]
	 *       whichever is smallest, increase corresponding pointer.
	 * 	     (i.e. if A[i] is the smallest, then i++, if B[j] is smaller then j++)
	 * 	  }
	 * }
	 * 
	 * TIME --- O(n1+n2+n3)
	 * SPACE -- O(1)
	 * 
	 */
}
