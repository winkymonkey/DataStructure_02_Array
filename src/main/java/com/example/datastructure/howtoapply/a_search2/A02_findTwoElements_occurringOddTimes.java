package com.example.datastructure.howtoapply.a_search2;

/**
 * *****************************************************************************
 * Find the two numbers with odd occurrences in an unsorted array
 * *****************************************************************************
 * I/P: {12, 23, 34, 12, 12, 23, 12, 45}
 * O/P: 34 and 45
 * 
 * I/P: {10, 20}
 * O/P: 10 and 20
 * 
 * *****************************************************************************
 */
public class A02_findTwoElements_occurringOddTimes {
	/*
	 * ---------------
	 * ---USING XOR---
	 * ---------------
	 * ::STEP-1::
	 * X1 = XOR of array elements
	 * As only two elements(P, Q) occurs odd number of times, all elements occurring even times will be canceled out
	 * So the X1 will be P^Q
	 * 
	 * 
	 * ::STEP-2::
	 * Pick rightmost 'set-bit' of X1 by calculating 'set_bit_no = X1 & ~(X-1)' 
	 * Now divide elements in two sets:
	 *   One group having the corresponding bit as 1
	 *   Another group having the corresponding bit as 0
	 * 
	 * If we XOR the first group, we will get one odd occurring element			if((A[i] & set_bit_no)>0) 	x=x^A[i]; 
	 * If we XOR the second group, we will get another odd occurring element	else						y=y^A[i];
	 * 
	 */
}
