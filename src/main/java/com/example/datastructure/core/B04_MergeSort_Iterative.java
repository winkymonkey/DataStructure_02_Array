package com.example.datastructure.core;



public class B04_MergeSort_Iterative {
	private static B04_MergeSort_Iterative obj = new B04_MergeSort_Iterative();
	
	public static void main(String[] args) {
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		int len = arr.length;
		obj.mergeSort(arr, len);
	}
	
	
	private void mergeSort(int[] arr, int n) {
		int currSize; 			// For current size of subarrays to be merged (curr_size varies from 1 to n/2)
		int leftStart; 			// For picking starting index of left subarray to be merged

		// Merge subarrays in bottom up manner.
		// First merge subarrays of size 1 to create sorted subarrays of size 2.
		// Then merge subarrays of size 2 to create sorted subarrays of size 4, and so on.
		for (currSize = 1; currSize <= (n-1); currSize = 2*currSize) {
			
			// Pick starting point of different subarrays of current size
			for (leftStart = 0; leftStart < (n-1); leftStart += 2*currSize) {
				
				// Find ending point of left subarray. mid+1 is starting point of right
				int mid = leftStart + currSize - 1;

				int rightEnd = findMin(leftStart + 2*currSize-1, n-1);

				// Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
				merge(arr, leftStart, mid, rightEnd);
			}
		}
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
	    while(i < n1 && j < n2) {
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
