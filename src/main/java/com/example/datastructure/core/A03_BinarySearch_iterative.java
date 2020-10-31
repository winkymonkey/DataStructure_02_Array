package com.example.datastructure.core;


public class A03_BinarySearch_iterative {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//			0  1  2  3   4
		int KEY = 10;
		int index = search(A, 0, A.length-1, KEY);
		System.out.println(index);
	}
	
	private static int search(int A[], int left, int right, int KEY) {
		while (left < right) {
			int mid = (left + right) / 2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	
}
