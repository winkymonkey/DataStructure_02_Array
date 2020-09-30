package com.example.datastructure.howtoapply.a_search1;

/**
 * *****************************************************************************
 * Find a triplet that sum to a given value
 * *****************************************************************************
 * I/P: A[]={12, 3, 4, 1, 6, 9}		SUM=24
 * O/P: 12,3,9
 * 
 * *****************************************************************************
 */
public class A04_findTriplet_thatSumToGivenValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Run 3 nested loops which results in time of O(n^3)
	 * for(i=0 to n-2)
	 * 	 for(j=i+1 to n-1)
	 * 		for(k=j+1 to n)
	 * 			if (A[i] + A[j] + A[k] == sum)
	 * 				return true
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array
	 * {1, 3, 4, 6, 9, 12}
	 * 
	 * Now for each element of the array, apply 'sliding door' technique.
	 * for(i=0 to n-2){
	 * 	 l=i+1;
	 * 	 r=n-1;
	 * 	 while(l < r){
	 * 	 	//apply 'sliding door' technique
	 * 	 }
	 * }
	 * TIME -- O(n*log n)+O(n^2)~~O(n^2)
	 * SPACE -- O(1)
	 * 
	 */
}
