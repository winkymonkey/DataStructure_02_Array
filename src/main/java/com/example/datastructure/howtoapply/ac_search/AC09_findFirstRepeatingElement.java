package com.example.datastructure.howtoapply.ac_search;

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

public class AC09_findFirstRepeatingElement {
	/*
	 * -------------
	 * ---SORTING---
	 * -------------
	 * A[] = {10, 5, 3, 4, 3, 5, 6}
	 * TEMP[] = {3, 3, 4, 5, 5, 6, 10}	//sorted version 	//O(nLogn)
	 * 
	 * for(i=0 to length){
	 * 	 //find A[i] in TEMP[] using binary search	//O(Logn)
	 * 	 //occurs more than once, return A[i]
	 * }
	 * 
	 * TIME --- O(nLogn) + n*O(Logn)
	 * SPACE -- O(n)
	 * 
	 */
}
