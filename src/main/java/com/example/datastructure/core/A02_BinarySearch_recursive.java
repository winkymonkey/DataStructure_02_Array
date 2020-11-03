package com.example.datastructure.core;


public class A02_BinarySearch_recursive {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		int KEY = 10;
		
		int index = search(A, 0, A.length-1, KEY);
		System.out.println(index);
	}
	
	private static int search(int A[], int left, int right, int KEY) {
		if (left <= right) {
			int mid = (left+right)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				return search(A, left, mid-1, KEY);
			else
				return search(A, mid+1, right, KEY);
				
		}
		return -1;
	}
	
}
