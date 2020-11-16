package com.example.datastructure.g_sort;

import java.util.Arrays;

/**
 * *****************************************************************************
 * How to sort an array in a single loop?
 * *****************************************************************************
 */

public class G07_sortInSingleLoop {
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		sort(A);
	}
	
	
	private static void sort(int A[]) {
		for (int i=0, j=i+1; i<A.length && j<A.length; ) {
			if (A[i] > A[j]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i=0;
				j=i+1;
			}
			else {
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(A));
	}
}
