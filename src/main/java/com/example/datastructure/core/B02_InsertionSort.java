package com.example.datastructure.core;

import java.util.Arrays;



public class B02_InsertionSort {
	private static B02_InsertionSort obj = new B02_InsertionSort();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.insertionSort(A, A.length);
	}
	
	
	/**
	 * Traverse from start+1 to end
	 *  - declare current element as KEY
	 *  - right shift all smaller elements before it to create a slot for KEY
	 *  - place KEY at the slot
	 * Traverse from start+2 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * Traverse from start+3 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * .....
	 * .....
	 */
	private void insertionSort(int[] A, int len) {
		for(int i=1; i<len; i++) {		//Traverse from start+1 to end
			int KEY = A[i];
			int j = i-1;
			
			while(j>=0 && KEY<A[j]) {	//if KEY < current element
				A[j+1] = A[j];			//right shift all smaller elements before it to create a slot for KEY
				j--;
			}
			A[j+1] = KEY;				//place KEY at the slot
		}
		System.out.println(Arrays.toString(A));
	}
}
