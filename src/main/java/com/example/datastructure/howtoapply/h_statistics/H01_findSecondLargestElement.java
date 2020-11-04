package com.example.datastructure.howtoapply.h_statistics;


public class H01_findSecondLargestElement {
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i=0; i<A.length; i++) {
			if (A[i] > largest) {				// If (A[i] > largest) ==> update both largest and secondLargest
				secondLargest = largest;
				largest = A[i];
			}
			else if (secondLargest < A[i] && A[i] < largest) {		// If (A[i] is in between largest & secondLargest) ==> update secondLargest
				secondLargest = A[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}
	
}
