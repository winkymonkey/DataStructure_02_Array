package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Find the first repeating element in an array of integers
 * *****************************************************************************
 * I/P: A[]={10, 5, 3, 4, 3, 5, 6}
 * O/P: 5
 * 
 * I/P: A[]={6, 10, 5, 4, 9, 120, 4, 6, 10}
 * O/P: 6
 * 
 * *****************************************************************************
 */
public class A09_findFIrstRepeatingElement {
	/*
	 * -------------
	 * ---SORTING---
	 * -------------
	 * A[] = {10, 5, 3, 4, 3, 5, 6}
	 * TEMP[] = {3, 3, 4, 5, 5, 6, 10}	//sorted version 	//O(n* log n)
	 * 
	 * for(i=0 to length){
	 * 	 //find A[i] in TEMP[] using binary search	//O(log n)
	 * 	 //occurs more than once, return A[i]
	 * }
	 * 
	 * TIME -- O(n * log n) + n*O(log n) ~~ O(n * log n)
	 * SPACE -- O(n)
	 * 
	 */
}
