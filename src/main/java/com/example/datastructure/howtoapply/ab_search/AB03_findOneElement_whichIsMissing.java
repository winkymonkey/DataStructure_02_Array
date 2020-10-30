package com.example.datastructure.howtoapply.ab_search;

/**
 * *****************************************************************************
 * Find the Missing Number
 * *****************************************************************************
 * We are given an array A[] of size n-1
 * Array elements are numbers which are from 1 to n in random order
 * There are no duplicates in list
 * One of them is missing from the integer list 
 * Find the missing integer
 * *****************************************************************************
 * I/P: [1, 2, 4, 6, 3, 7, 8]
 * O/P: 5
 * 
 * *****************************************************************************
 */

public class AB03_findOneElement_whichIsMissing {
	/*
	 * -------------------
	 * ---USING SORTING---
	 * -------------------
	 * Sort the input array
	 * Traverse the array and check for missing
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------
	 * ---USING SUM---
	 * ---------------
	 * SUM1 = sum of array elements
	 * SUM2 = sum of first (n-1) natural numbers
	 * ELEMENT = (SUM2-SUM1) = missing element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------
	 * ---USING XOR---
	 * ---------------
	 * X1 = XOR of array elements
	 * X2 = XOR of first (n-1) natural numbers
	 * X1^X2 = missing element 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
