package com.example.datastructure.m_misc;

/**
 * *****************************************************************************
 * Find next Smaller of next Greater in an array
 * *****************************************************************************
 * I/P: {5, 1, 9, 2, 5, 1, 7}
 * O/P:  2  2 -1  1 -1 -1 -1
 * 
 * Next Greater		Right Smaller 
 * 	5 ->  9				9 ->  2
 * 	1 ->  9				9 ->  2
 * 	9 -> -1			   -1 -> -1
 * 	2 ->  5				5 ->  1
 * 	5 ->  7				7 -> -1
 * 	1 ->  7				7 -> -1
 * 	7 -> -1			   -1 -> -1
 * 
 * *****************************************************************************
 */

public class M08_nextSmaller_ofNextGreater {
	/*
	 * First find the Next Greater element & store them in an array NGE[]
	 * But instead of storing the element, let us store the index of next greater element.
	 * Now according those index, find the "Next Smaller Element" & store them in an array NSE[]
	 * 
	 */
}
