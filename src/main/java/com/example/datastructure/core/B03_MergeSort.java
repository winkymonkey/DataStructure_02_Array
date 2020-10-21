package com.example.datastructure.core;

import java.util.Arrays;


public class B03_MergeSort {
	private static B03_MergeSort obj = new B03_MergeSort();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		int left = 0;
		int right = A.length-1;
		
		obj.mergeSort(A, left, right);
		System.out.println(Arrays.toString(A));
	}
	
	
	private void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);		//Call mergeSort for first half
			mergeSort(arr, mid+1, right);	//Call mergeSort for second half
			merge(arr, left, mid, right);	//Merge the sorted halves (CORE OF MERGE SORT)
		}
	}
	
	
	private void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid-left+1;		//no of elements in left-sorted-half
		int n2 = right-mid; 		//no of elements in right-sorted-half
		
		int L[] = new int[n1];		//create L[] for left-sorted-half
		int R[] = new int[n2];		//create R[] for right-sorted-half
		
		for(int x=0; x<n1; x++)
			L[x] = arr[left+x];			//copy left-sorted-half to L[]
		for(int z=0; z<n2; z++)
			R[z] = arr[(mid+1)+z];		//copy right-sorted-half to R[]
		
		//smallest from each of L[] and R[] is placed in original array
		int i=0;				//to traverse L[]
		int j=0;				//to traverse R[]
		int k = left;			//to track merged array
        while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			}
			else {
				arr[k] = R[j];
				j++;
				k++;
			}
        }
		
		//copy remaining elements (if any) of L[] to original array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		//copy remaining elements (if any) of R[] to original array
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
