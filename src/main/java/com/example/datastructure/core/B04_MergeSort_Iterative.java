package com.example.datastructure.core;

import java.util.Arrays;


public class B04_MergeSort_Iterative {
	private static B04_MergeSort_Iterative obj = new B04_MergeSort_Iterative();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.mergeSort(A);
	}
	
	
	/**
	 * Merge subarrays in bottom up manner.
	 *  - merge subarrays of size 1 to create sorted sub-arrays of size 2
	 *  - merge subarrays of size 2 to create sorted sub-arrays of size 4
	 *  - .......
	 *  - .......
	 */
	private void mergeSort(int[] A) {
		for (int size=1; size<=A.length-1; size=2*size) {		//current size of subarrays to be merged
			
			for (int left=0; left<A.length-1; left+=2*size) {		//starting index of different subarrays to be merged
				
				// Find ending point of left subarray. mid+1 is starting point of right
				int mid = left+size-1;

				int right = findMin(left+(2*size)-1, A.length-1);

				// Merge Subarrays A[left_start...mid] & A[mid+1...right_end]
				merge(A, left, mid, right);
			}
		}
		System.out.println(Arrays.toString(A));
	}
	
	
	//Utility function to find minimum of two integers
	private int findMin(int x, int y) {
		return (x<y)? x :y;
	}
	
	
	void merge(int arr[], int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;
	 
	    /*create temp arrays*/
	    int L[] = new int[n1];
	    int R[] = new int[n2];
	 
	    /*copy from 'arr' to temp arrays*/
	    for (int i = 0; i < n1; i++)
	        L[i] = arr[left + i];
	    for (int j = 0; j < n2; j++)
	        R[j] = arr[mid + 1+ j];
	 
	    /*traverse L[] & R[].. smallest from each is stored back to original array*/
	    int i=0, j=0;
	    int k = left;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            arr[k] = L[i];
	            i++;
	        }
	        else {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /*copy the remaining elements of L[], if there are any*/
	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /*copy the remaining elements of R[], if there are any*/
	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
}
