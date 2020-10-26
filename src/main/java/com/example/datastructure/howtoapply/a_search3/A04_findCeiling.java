package com.example.datastructure.howtoapply.a_search3;

/**
 * *****************************************************************************
 * Ceiling in a sorted array
 * *****************************************************************************
 * Given a sorted array and a value X,
 * 		the ceiling of X is the smallest element in array >= X
 * 		the floor of X is the greatest element in array <= X
 * *****************************************************************************
 * I/P: {1, 2, 8, 10, 10, 12, 19}
 * 
 * O/P: For X = 0:		FLOOR--n/a	CEILING--1
 * O/P: For X = 1:		FLOOR--1	CEILING--1
 * O/P: For X = 5:		FLOOR--2	CEILING--8
 * O/P: For X = 20:		FLOOR--19	CEILING--n/a
 * 
 * *****************************************************************************
 */
public class A04_findCeiling {
	/*
	 * -------------------
	 * ---BINARY SEARCH---
	 * -------------------
	 * find the slot (i) for X using Binary search
	 * then FLOOR=A[i] and CEILING=A[i+1]
	 * 
	 * E.g,
	 * for X=5 ---- 'i' is 2
	 * so FLOOR=2, CEILING=8
	 * 
	 * TIME --- O(Log n)
	 * SPACE -- O(1)
	 * 
	 */
}
