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
	
	
	private void quickSort(int[] A, int left, int right) {
		if(left < right){
			int pi = partition(A, left, right);	//pi is partitioning index, A[pi] is now at right place
			quickSort(A, left, pi-1);			//Call quickSort for first part
			quickSort(A, pi+1, right);			//Call quickSort for second part
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
	
	
	
	/**
	 * --------------------------
	 * 		TIME COMPLEXITY
	 * --------------------------
	 * in case of merge sort, the array is divided in two equal halves
	 * But in case of quick sort, the 'partitioning place' depends on the 'partitioning algorithm'
	 * 
	 * In best case, the array is divided into two equal halves.
	 *     T(n) = T(n/2) + T(n/2) + O(n)
	 *          = 2.T(n/2) + O(n)
	 *          = O(n log n)
	 * 
	 * In worst case, one partition contains 0 elements, and another partition contains (n-1) elements 
	 *     T(n) = T(0) + T(n-1) + O(n)
	 *          = T(n-1) + O(n)
	 *          = T(n-1) + c.n
	 *          = T(n-2) + c(n-1) + c.n
	 *          = T(n-3) + c(n-2) + c(n-1) + c.n
	 *          = ......
	 *          = ......
	 *          = 0 + c.1 + c.2 + c.3 + .......+c.n
	 *          = c(1+2+3+.....n)
	 *          = c(n*(n+1)/2)
	 *          = O(n^2)
	 * 
	 * 
	 * 
	 * 
	 * --------------------------
	 * 		SPACE COMPLEXITY
	 * --------------------------
	 * In best case, the recursion tree is equally balanced. ==> hence total space is 'height of the tree' which is O(log n)
	 * In worst case, the recursion tree is skewed ===> hence total space is 'O(n)'
	 * 
	 */
}
