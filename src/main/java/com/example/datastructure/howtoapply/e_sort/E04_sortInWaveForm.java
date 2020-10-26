package com.example.datastructure.howtoapply.e_sort;

/**
 * ******************************************************************************************
 * Sort an array in wave form.
 * ******************************************************************************************
 * An array ARR[0..n-1] is sorted in wave form if 
 * 		A[0] >= A[1] <= A[2] >= A[3] <= A[4] >= .....
 * ******************************************************************************************
 * I/P: {10, 5, 6, 3, 2, 20, 100, 80}
 * O/P: {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3} OR any other array that is in wave form
 * 
 * I/P: {2, 4, 6, 8, 10, 20}
 * O/P: {4, 2, 8, 6, 20, 10} OR any other array that is in wave form
 * 
 * ******************************************************************************************
 */
public class E04_sortInWaveForm {
	/*
	 * Traverse all even positioned elements of input array
	 *   - If current element is smaller than previous element, swap previous and current.
	 *   - If current element is smaller than next element, swap next and current.
	 *   
	 */
}
