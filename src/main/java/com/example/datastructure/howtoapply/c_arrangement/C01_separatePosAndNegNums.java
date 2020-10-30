package com.example.datastructure.howtoapply.c_arrangement;

import java.util.Arrays;

/**
 * *******************************************************************************************************
 * Rearrange positive and negative numbers with constant extra space.
 * *******************************************************************************************************
 * Given an array of POS and NEG numbers, arrange them such that all NEG numbers appear before all the POS numbers.
 * 		Constraint - NO additional data structure
 * 		Constraint - Maintain the order of appearance
 * 
 * *******************************************************************************************************
 * I/P: [12 11 -13 -5 6 -7 5 -3 -6]
 * O/P: [-13 -5 -7 -3 -6 12 11 6 5]
 * 
 * *******************************************************************************************************
 */

public class C01_separatePosAndNegNums {
	/*
	 * -------------------------
	 * ---MODIFIED QUICK SORT---
	 * -------------------------
	 * Use the "Partition process of the QuickSort" assuming the 'PIVOT = 0'
	 * Hence all negative numbers will be left aligned, all positive numbers will be right aligned
	 * 
	 * PIVOT = 0;
	 * k = -1;
	 * for (i=0 to length) {
	 *    if (A[i] < PIVOT) {
	 *       k++;
	 *       swap A[i] and A[k];
	 *    }
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * But it's NOT ACCEPTABLE -- as the order of the elements are not maintained here (this is how QuickSort works).
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------
	 * ---MODIFIED INSERTION SORT---
	 * -----------------------------
	 * Traverse the array from left to right
	 * When encounter a Negative number, copy it in KEY variable
	 * Then right-shift all the numbers left to it
	 * Then place the KEY in the opened slot
	 * 
	 * for (i=0 to length) {
	 *    KEY = A[i]
	 *    if (A[i] is negative) {
	 *       right-shift all positive numbers sitting at left of A[i]
	 *       place the KEY in the opened slot
	 *    }
	 * }
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---MODIFIED MERGE SORT---
	 * -------------------------
	 * Use the "Merge process of the MergeSort" keeping the below points in mind
	 * While merging two sorted halves, merge it in such a way that:
	 *  - negative parts of both the subarrays are copied first
	 *  - then positive parts of both the subarrays are copied
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(n)
	 * 
	 * But it's NOT ACCEPTABLE -- as extra O(n) space is used (this is how MergeSort works).
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------------
	 * ---FURTHER MODIFIED MERGE SORT---
	 * ---------------------------------
	 * Instead of using extra space while merging in above solution, we can use the concept of 'block reversal' in rotation
	 * 
	 * Let Ln and Lp denotes the negative part and positive part of left sub-array respectively.
	 * And Rn and Rp denotes the negative and positive part of right sub-array respectively.
	 *    [Ln Lp  Rn  Rp]
	 * -> [Ln Lp’ Rn’ Rp]		//Reverse Lp and Rn
	 * -> [Ln Rn  Lp  Rp]		//Reverse [Lp’ Rn’]
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(Logn)	for recursive calls
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		rearrangePosNeg(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	private static void rearrangePosNeg(int A[], int left, int right) {
		if (left < right) {
			int mid = (left+right)/2;
			rearrangePosNeg(A, left, mid);
			rearrangePosNeg(A, mid+1, right);
			merge(A, left, mid, right);
		}
	}
	
	private static void merge(int A[], int left, int mid, int right) {
		int i = left; 					// Initial index of 1st subarray
		int j = mid+1; 					// Initial index of 2nd subarray

		while (i<=mid && A[i]<0)			//after traversal --- Ln = A[left] to A[i-1]
			i++;						//after traversal --- Lp = A[i] to A[mid]

		while (j<=right && A[j]<0)		//after traversal --- Rn = A[mid+1] to A[j-1]
			j++;						//after traversal --- Rp = A[j] to A[right]

		reverse(A, i, mid);				//reverse Lp (A[i] to A[mid])
		reverse(A, mid+1, j-1);			//reverse Rn (A[mid+1] to A[j-1])
		reverse(A, i, j-1);				//reverse Lp'Rn' (A[i] to A[j-1]
	}
	
	private static void reverse(int A[], int left, int right) {
		if (left < right) {
			int temp = A[left];
			A[left] = A[right];
			A[right] = temp;
			
			reverse(A, ++left, --right);
		}
	}
}
