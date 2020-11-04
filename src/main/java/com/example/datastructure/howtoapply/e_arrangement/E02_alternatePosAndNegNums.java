package com.example.datastructure.howtoapply.e_arrangement;

/**
 * ******************************************************************************************
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * ******************************************************************************************
 * An array contains both positive and negative numbers in random order. 
 * Rearrange the array elements so that positive and negative numbers are placed alternatively. 
 * Number of positive and negative numbers need not be equal. 
 * If there are more positive numbers, they appear at the end of the array. 
 * If there are more negative numbers, they too appear in the end of the array.
 * ******************************************************************************************
 * Input:  A[] = [-1, 2, -3, 4, 5, 6, -7, 8, 9]
 * Output: A[] = [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * 
 * ******************************************************************************************
 */

public class E02_alternatePosAndNegNums {
	/*
	 * -------------------------
	 * ---MODIFIED QUICK SORT---
	 * -------------------------
	 * Positive & Negative numbers are distributed around 0
	 * So let us do "Partition Process Quick Sort" based on 'KEY'=0
	 * After the sort, all negative numbers will be left aligned, All positive numbers will be right aligned
	 * Now start from the 1st negative number and 1st positive number, and swap every alternate negative number with next positive number.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * ------------
	 * PIVOT = 0;
	 * k = -1;
	 * for (i=0 to length) {
	 *    if (A[i] < PIVOT) {
	 *       k++;
	 *       swap A[i] and A[k];
	 *    }
	 * }
	 * 
	 * NEG = 0; 		//1st negative number
	 * POS = k+1;		//1st positive number (i.e. 'k' is pointing to the last negative number)
	 * 
	 * while (POS<n && NEG<POS && A[NEG]<0) {
	 *    //swap A[NEG] and A[POS]
	 *    NEG +=2
	 *    POS++
	 * }
	 * 
	 */
}
