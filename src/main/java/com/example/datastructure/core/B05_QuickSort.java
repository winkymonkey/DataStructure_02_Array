package com.example.datastructure.core;

import java.util.Arrays;



public class B05_QuickSort {
	private static B05_QuickSort obj = new B05_QuickSort();	
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		int left = 0;
		int right = A.length-1;
		
		obj.quickSort(A, left, right);
		System.out.println(Arrays.toString(A));
	}
	
	
	private void quickSort(int[] arr, int left, int right) {
		if(left < right){
			int pi = partition(arr, left, right);	//pi is partitioning index, A[pi] is now at right place
			quickSort(arr, left, pi-1);				//Call quickSort for first part
			quickSort(arr, pi+1, right);			//Call quickSort for second part
		}
	}
	
	
	private int partition(int A[], int left, int right) {
		int pivot = A[right];
		int i = left-1; 					//index of smaller element
		for (int j=left; j<right; j++){
			if (A[j] <= pivot){			//if current element is smaller than or equal to pivot
				i++;
				//swap A[i] and A[j]
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		//swap A[i+1] and A[right] (or pivot)
		int temp = A[i+1];
		A[i+1] = A[right];
		A[right] = temp;

		return i+1;
	}
}
