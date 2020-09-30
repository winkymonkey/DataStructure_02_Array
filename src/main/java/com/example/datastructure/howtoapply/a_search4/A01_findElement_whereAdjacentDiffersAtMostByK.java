package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Searching in an array where adjacent differ by at most k
 * *****************************************************************************
 * It's an array of integer where each element has a difference of at-most 'K' with its neighbor.
 * Given a key ELEM, we need to find the index value of ELEM
 * If ELEM occurs multiple times, return the first occurrence of ELEM
 * *****************************************************************************
 * I/P: {4, 5, 6, 7, 6},	K=1,	X=6
 * O/P: 2					//X=6 occurs at index=2
 * 
 * I/P: {40, 50, 40, 50, 60, 80, 60},	K=20,	X=80
 * O/P: 5								//X=80 occurs at index=5
 * 
 * *****************************************************************************
 */
public class A01_findElement_whereAdjacentDiffersAtMostByK {
	/*
	 * ----------------------
	 * ---OPTIMAL SOLUTION---
	 * ----------------------
	 * Instead of doing linear search,
	 * we can utilize the property which says the adjacent elements can differ at most by K
	 *  
	 * i=0;
	 * while(i<length){
	 * 	 if(A[i]==ELEM){
	 * 		//return
	 * 	 }
	 * 	 else {
	 * 		//From the given property of array, we always know that X must be at-least 'DIFF/K' away.
	 * 		//Hence, instead of searching one-by-one, we can jump 'DIFF/K'.
	 * 		DIFF = ELEM-A[i];
	 * 		i = i+(DIFF/K);
	 * 	 }
	 * }
	 * 
	 */
}
