package com.example.datastructure.howtoapply.d_arrangement;

/**
 * *******************************************************************************************************
 * Rearrange positive and negative numbers with constant extra space.
 * Given an array of POS and NEG numbers, arrange them such that all NEG numbers appear before all the POS numbers.
 * 		Constraint - Cannot use any additional data structure like hash table, arrays, etc.
 * 		Constraint - The order of appearance should be maintained.
 * *******************************************************************************************************
 * I/P: [12 11 -13 -5 6 -7 5 -3 -6]
 * O/P: [-13 -5 -7 -3 -6 12 11 6 5]
 * *******************************************************************************************************
 */
public class D01_separatePosAndNegNums {
	/*
	 * -------------------------
	 * ---MODIFIED QUICK SORT---
	 * -------------------------
	 * Positive & Negative numbers are distributed around 0
	 * So let us do "Partition Process Quick Sort" based on 'PIVOT=0'
	 * After that all negative numbers will be left aligned, All positive numbers will be right aligned
	 * 
	 * PIVOT = 0;
	 * k = -1;
	 * for(i=0 to length) {
	 *    if(A[i] < PIVOT) {
	 *       k++;
	 *       swap A[i] and A[k];
	 *    }
	 *    i++;
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -----------------------------
	 * ---MODIFIED INSERTION SORT---
	 * -----------------------------
	 * 	When encounter an Neg number, right-shift all the numbers left to it which will create a hole
	 * 	Then place the current Neg number in the hole.
	 * 
	 */
}
