package com.example.datastructure.howtoapply.a_search2;

/**
 * *****************************************************************************
 * Find the Number Occurring Odd Number of Times
 * *****************************************************************************
 * I/P: {1, 2, 3, 2, 3, 1, 3}
 * O/P: 3
 * 
 * I/P: {5, 7, 2, 7, 5, 2, 5}
 * O/P: 5
 * 
 * *****************************************************************************
 */
public class A01_findOneElement_occurringOddTimes {
	/*
	 * -------------------
	 * ---USING HASHING---
	 * -------------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 * 	 if(HASHMAP.containsKey(A[i])) {
	 * 		value = HASHMAP.get(A[i]);
	 * 		HASHMAP.put(A[i], value++)
	 * 	 }
	 * 	 else {
	 * 		HASHMAP.put(A[i], 0)
	 * 	 }
	 * }
	 * Traverse HASHMAP to find which key has a value of Odd number
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * Perform a Bitwise XOR of all elements
	 * It gives us odd occurring element
	 *  
	 */
}
