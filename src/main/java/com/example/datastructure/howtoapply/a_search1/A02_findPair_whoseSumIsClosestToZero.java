package com.example.datastructure.howtoapply.a_search1;

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
public class A02_findPair_whoseSumIsClosestToZero {
	/*
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array
	 * {-80, -72, 10, 1, 60, 70, 85}
	 * 
	 * res_sum
	 * res_l
	 * res_r
	 * 
	 * l = 0
	 * r = n-1
	 * while(l < r) {
	 * 	 if( abs(A[l]+A[r]) < abs(res_sum) ) {
	 * 		min_sum = A[l]+A[r]
	 *   	res_l = l
	 *   	res_r = r
	 *   }
	 *   
	 * 	 if( A[l]+A[r] > 0 )
	 * 		r--
	 * 	 else if(A[l]+A[r] < 0)
	 * 		l++
	 * 	 
	 * }
	 * 
	 * TIME -- O(n*log n) + O(n) ~ O(n*log n)
	 * SPACE -- O(1)
	 * 
	 */
}
