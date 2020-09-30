package com.example.datastructure.core;

import java.util.Arrays;



public class B02_InsertionSort {
	private static B02_InsertionSort obj = new B02_InsertionSort();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.insertionSort(A, A.length);
	}
	
	
	private void insertionSort(int[] A, int len) {
		for(int i=1; i<len; i++) {	//start comparing from second element (index 1)
			int KEY = A[i];
			int j = i-1;
			
			while(j>=0 && A[j]>KEY) {	//if KEY is smaller than current array element
				A[j+1] = A[j];	//right shift all elements to create a position for KEY
				j--;
			}
			A[j+1] = KEY;	//place KEY at its expected position
		}
		System.out.println(Arrays.toString(A));
	}
}
