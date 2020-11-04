package com.example.datastructure.howtoapply.e_arrangement;

import java.util.Arrays;


public class E01B_separatePosAndNegNums {
	
	public static void main(String[] args) {
		int A[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		rearrangePosNeg(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	private static void rearrangePosNeg(int A[], int left, int right) {
		if (left < right) {
			int mid = (left+right)/2;
			rearrangePosNeg(A, left, mid);
			rearrangePosNeg(A, mid+1, right);
			merge(A, left, mid, right);
		}
	}
	
	private static void merge(int A[], int left, int mid, int right) {
		int i = left; 					// Initial index of 1st subarray
		int j = mid+1; 					// Initial index of 2nd subarray

		while (i<=mid && A[i]<0)		//after traversal --- Ln = A[left] to A[i-1]
			i++;						//after traversal --- Lp = A[i] to A[mid]

		while (j<=right && A[j]<0)		//after traversal --- Rn = A[mid+1] to A[j-1]
			j++;						//after traversal --- Rp = A[j] to A[right]

		reverse(A, i, mid);				//reverse Lp (A[i] to A[mid])
		reverse(A, mid+1, j-1);			//reverse Rn (A[mid+1] to A[j-1])
		reverse(A, i, j-1);				//reverse Lp'Rn' (A[i] to A[j-1]
	}
	
	private static void reverse(int A[], int left, int right) {
		if (left < right) {
			int temp = A[left];
			A[left] = A[right];
			A[right] = temp;
			
			reverse(A, ++left, --right);
		}
	}
	
}
