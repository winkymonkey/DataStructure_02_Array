package com.example.datastructure.howtoapply.a_search1;

/**
 * *****************************************************************************
 * Given an array A[] and a number X, check for pair in A[] with sum as SUM
 * *****************************************************************************
 * I/P: 1, 4, 45, 6, 10, -8		SUM=16
 * O/P: YES		//10+6
 * 
 * *****************************************************************************
 */ 
public class A01_findPair_ofGivenSum {
	/*
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array
	 * {-8, 1, 4, 6, 10, 45}
	 * 
	 * l=0
	 * r=n-1
	 * while(l < r){
	 * 	 if(A[l]+A[r] == SUM)
	 * 		return true;
	 * 	 else if(A[l]+A[r] > SUM)
	 * 		r--;
	 * 	 else if(A[l]+A[r] < SUM)
	 * 		l++;
	 * }
	 * TIME -- O(n*log n) + O(n) ~ O(n*log n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for(i=0 to n-1) {
	 * 	 if(HASHMAP.contains(SUM-A[i]))
	 * 		//print "found" A[i] and SUM-A[i]
	 * 	 else
	 * 		HASHMAP.put(A[i], 999999)
	 * }
	 * TIME -- O(n)
	 * SPACE -- O(n)
	 * 
	 */
}
