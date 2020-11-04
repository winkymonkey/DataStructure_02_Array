package com.example.datastructure.howtoapply.e_arrangement;

/**
 * *******************************************************************************************************
 * Rearrange positive and negative numbers with constant extra space.
 * *******************************************************************************************************
 * Given an array of POS and NEG numbers, arrange them such that all NEG numbers appear before all the POS numbers.
 * 		Constraint - NO additional data structure
 * 		Constraint - Maintain the order of appearance
 * 
 * *******************************************************************************************************
 * Input:  [12 11 -13 -5 6 -7 5 -3 -6]
 * Output: [-13 -5 -7 -3 -6 12 11 6 5]
 * 
 * *******************************************************************************************************
 */

public class E01A_separatePosAndNegNums {
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
	 * -> [Ln Lp’ Rn’ Rp]		//Reverse Lp, Reverse Rn
	 * -> [Ln Rn  Lp  Rp]		//Reverse [Lp’ Rn’]
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(Logn)	for recursive calls
	 * 
	 */
}
