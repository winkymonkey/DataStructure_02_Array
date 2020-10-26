package com.example.datastructure.howtoapply.a_search3;

/**
 * *****************************************************************************
 * Count number of occurrences (or frequency) in a sorted array
 * *****************************************************************************
 * Find how many times a given element X occurs in a sorted array
 * *****************************************************************************
 * I/P: A[]={1, 1, 2, 2, 2, 2, 3,}		X=2
 * O/P: 4								//X(=2) occurs 4 times
 * 
 * I/P: {1, 1, 2, 2, 2, 2, 3,}		X=4
 * O/P: -1							//X(=4) does not occur
 * 
 * *****************************************************************************
 */
public class AC06_countFrequencyOfGivenElement {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * linearly search X
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFECIENT APPROACH---
	 * ------------------------
	 * Search first index of X using binary search. Let the index be 'i'
	 * Search last index of X using binary search. Let the index be 'j'
	 * Count = (j-1)+1
	 * 
	 * TIME --- O(Log n)
	 * SPACE -- O(1)
	 * 
	 */
}
