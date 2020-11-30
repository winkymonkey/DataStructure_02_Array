package com.example.datastructure.n_game;

import java.util.Arrays;

/**
 * ************************************************************************
 * A Boolean Array Puzzle
 * ************************************************************************
 * Input: 	an array A[] of two elements having value 0 and 1
 * Output: 	make both elements 0.
 * ************************************************************************
 * Specifications:
 * 		- It is guaranteed that one element is 0 and another is 1. But we do not know their position
 * 		- No arithmetic (add/subtract/multiply/divide etc) OR logical (and/or/not/xor etc) operations are allowed
 * 		- No looping constructs (if/else/while/for) are allowed
 * 		- We can’t directly assign 0 to array elements
 * 
 * ************************************************************************
 */

public class N04_booleanArrayPuzzle {
	
	public static void main(String[] args) {
		int A[] = { 0, 1 };
		//			0  1

		A[0] = A[A[0]];
		A[1] = A[0];
		System.out.println(Arrays.toString(A));
		
		
		int B[] = { 1, 0 };
		//			0  1

		B[0] = B[B[0]];
		B[1] = B[0];
		System.out.println(Arrays.toString(B));
	}
	
}
