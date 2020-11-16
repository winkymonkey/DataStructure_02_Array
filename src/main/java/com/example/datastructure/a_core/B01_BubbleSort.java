package com.example.datastructure.a_core;

import java.util.Arrays;


public class B01_BubbleSort {
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		bubbleSort(A);
	}
	
	
	/**
	 * Traverse from start to end
	 *  - Swap two adjacent elements, keeping the larger element at right & smaller element at left.
	 *  - After one full iteration, the largest element will be at extreme right which is its final slot.
	 * Traverse from start to end-1
	 *  - repeat
	 *  - repeat
	 * Traverse from start to end-2
	 *  - repeat
	 *  - repeat
	 * .....
	 * .....
	 */
	private static void bubbleSort(int[] A) {
		int temp;
		for (int i=0; i<A.length; i++) {
			for (int j=1; j<A.length-i; i++) {
				if (A[j-1] > A[j]) {
					//swap
					temp = A[j-1];  
                    A[j-1] = A[j];  
                    A[j] = temp;  
				}
			}
		}
		System.out.println(Arrays.toString(A));
	}
	
}
