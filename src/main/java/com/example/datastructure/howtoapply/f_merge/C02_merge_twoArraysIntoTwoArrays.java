package com.example.datastructure.howtoapply.f_merge;

/**
 * *****************************************************************************
 * Merge two sorted arrays with O(1) extra space
 * *****************************************************************************
 * I/P: A[] = {1, 5, 9, 10, 15, 20};
 * 		B[] = {2, 3, 8, 13};
 * 
 * O/P: A[] = {1, 2, 3, 5, 8, 9}
 * 		B[] = {10, 13, 15, 20}
 * 
 * *****************************************************************************
 */
public class C02_merge_twoArraysIntoTwoArrays {
	/*
	 * A[] --- pointer i
	 * B[] --- pointer j
	 * 
	 * while(A[n-1] < B[0]){
	 * 		t1 = A[n-1];				//{1, 5, 9, 10, 15, 20},	t1=20
	 * 		t2 = B[0];					//{2, 3, 8, 13},			t2=2
	 * 		
	 *		//place t1 in B[] using insertion sort
	 *		//place t2 in A[] using insertion sort
	 * }
	 * 
	 */
}
