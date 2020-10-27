package com.example.datastructure.howtoapply.e_sort;

import java.util.Arrays;

/**
 * *****************************************************************************
 * How to sort an array in a single loop?
 * *****************************************************************************
 */
public class E07_sortInSingleLoop {
	private static E07_sortInSingleLoop obj = new E07_sortInSingleLoop();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.sort(A);
	}
	
	
	private void sort(int A[]) {
		for(int i=0, j=i+1; i<A.length && j<A.length; ) {
			if(A[i] > A[j]) {
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