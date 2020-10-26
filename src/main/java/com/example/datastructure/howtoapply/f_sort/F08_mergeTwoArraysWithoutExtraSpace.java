package com.example.datastructure.howtoapply.f_sort;

/**
 * *****************************************************************************
 * Merge two sorted arrays with O(1) extra space
 * *****************************************************************************
 * I/P: A[] = {10}
 *      B[] = {2, 3}
 * O/P: A[] = {2}
 *      B[] = {3, 10}
 * 
 * I/P: A[] = {1, 5, 9, 10, 15, 20}
 *      B[] = {2, 3, 8, 13}
 * O/P: A[] = {1, 2, 3, 5, 8, 9}
 *      B[] = {10, 13, 15, 20}
 * 
 * *****************************************************************************
 */

public class F08_mergeTwoArraysWithoutExtraSpace {
	/*
	 * The idea is to begin from last element of B[] and search it in A[]
	 * If there is a greater element in A[], then we move A[last] to correct place in B[]
	 * To keep A[] and B[] sorted, we need to place B[i] at correct place in A[] 
	 * 
	 * ----------------------
	 * for(i=n-1 to 0) {
	 *    search the suitable place 'k' for B[i] in A[] using binary search
	 *    
	 *    if(k <= n-1) {										---> it means that there is a greater element in A[]
	 *       binary search a suitable place for A[n-1] in B[]
	 *       place A[n-1] in its suitable place in B[]
	 *       place B[i] in its suitable place in A[]
	 *    }
	 * }
	 * 
	 */
}
