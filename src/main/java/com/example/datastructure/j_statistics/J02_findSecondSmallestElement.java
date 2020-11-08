package com.example.datastructure.j_statistics;


public class J02_findSecondSmallestElement {
	/*
	 * Use below OR use minHeap
	 */
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i=0; i<A.length; i++) {
			if (A[i] < smallest) {				// If (A[i] < smallest) ==> update both smallest and secondSmallest
				secondSmallest = smallest;
				smallest = A[i];
			}
			else if (smallest < A[i] && A[i] < secondSmallest) {		// If (A[i] is in between smallest & secondSmallest) ==> update secondSmallest
				secondSmallest = A[i];
			}
		}
		System.out.println(smallest);
		System.out.println(secondSmallest);
	}
	
}
