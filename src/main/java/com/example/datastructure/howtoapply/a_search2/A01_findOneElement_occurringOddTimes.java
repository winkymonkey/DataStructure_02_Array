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
	 * 		occurrence = HASHMAP.get(A[i]);
	 * 		HASHMAP.put(A[i], occurrence++)
	 * 	 }
	 * 	 else {
	 * 		HASHMAP.put(A[i], 1)
	 * 	 }
	 * }
	 * Traverse HASHMAP to find which KEY's VALUE is a odd number
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * Perform a Bitwise XOR of all elements
	 * It gives us odd occurring element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
