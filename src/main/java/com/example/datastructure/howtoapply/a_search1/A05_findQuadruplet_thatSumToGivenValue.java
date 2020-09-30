package com.example.datastructure.howtoapply.a_search1;

/**
 * *****************************************************************************
 * Find four elements that sum to a given value
 * *****************************************************************************
 * I/P: A[] = {10, 2, 3, 4, 5, 9, 7, 8}		X=23
 * O/P: [3 5 7 8]
 * 
 * *****************************************************************************
 */
public class A05_findQuadruplet_thatSumToGivenValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * We run 4 nested loops which results in time of O(n^4)
	 * for(i=0 to n-3)
	 * 	 for(j=i+1 to n-2)
	 * 		for(k=j+1 to n-1)
	 * 			for(m=k+1 to n)
	 * 				if (A[i] + A[j] + A[k] + A[m] == sum)
	 * 					return true
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array
	 * {2, 3, 4, 5, 7, 8, 9, 10}
	 * 
	 * for(i=0 to n-3){
	 * 	 for(j=i+1 to n-2){
	 * 		l=j+1;
	 * 	 	r=n-1;
	 * 	 	while(l < r){
	 * 	 		//apply 'sliding door' technique
	 * 	 	}
	 * 	 }
	 * }
	 * TIME -- O(n*log n)+O(n^3)~~O(n^3)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE--- (efficient)
	 * -----------------------------------
	 * Create an auxiliary array AUX[], which stores sum of all possible pairs
	 * If size of A[] is n, the size of AUX[] will be n*(n-1)/2
	 * Sort AUX[]
	 * Now apply 'sliding door' technique
	 * While picking two elements from AUX[],
	 * 	we must ensure that the two elements doesn't have any element from A[] in common.
	 * 
	 * TIME -- O(n^2 * log n)	
	 * SPACE -- O(n*(n-1)/2)~~O(n^2)
	 * 
	 * 
	 * 
	 * -------------
	 * ---HASHING---
	 * -------------
	 * Store sums of all pairs in a hash table
	 * Traverse through all pairs again and search for 'X�(current pair sum)' in the hash table.
	 * If a pair is found with the required sum,
	 * 	then make sure that all elements are distinct array elements 
	 * 	and an element is not considered more than once.
	 * 
	 * TIME -- O(n^2)
	 * SPACE -- O(n^2)
	 * 
	 */
}
