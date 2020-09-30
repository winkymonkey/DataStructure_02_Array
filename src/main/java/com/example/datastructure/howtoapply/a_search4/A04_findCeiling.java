package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Ceiling in a sorted array
 * *****************************************************************************
 * Given a sorted array and a value x,
 * 		the ceiling of x is the smallest element in array greater than or equal to x,
 * 		the floor is the greatest element smaller than or equal to x
 * *****************************************************************************
 * I/P: {1, 2, 8, 10, 10, 12, 19}
 * O/P: For x = 0:		FLOOR--n/a	CEILING--1
 * O/P: For x = 1:		FLOOR--1	CEILING--1
 * O/P: For x = 5:		FLOOR--2	CEILING--8
 * O/P: For x = 10:		FLOOR--19	CEILING--n/a
 * 
 * *****************************************************************************
 */
public class A04_findCeiling {
	/*
	 * -------------------
	 * ---BINARY SEARCH---
	 * -------------------
	 * find the slot(i) for X using Binary search.
	 * so FLOOR=i and CEILING=i+1
	 * for example, if X=5  'i' will be 1
	 * so FLOOR=1, CEILING=2
	 * 
	 */
}
