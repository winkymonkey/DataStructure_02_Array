package com.example.datastructure.a_core;


public class A03_BinarySearch_iterative {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//			0  1  2  3   4
		int KEY = 10;
		
		int l = 0;
		int r = A.length-1;
		int index = search(A, l, r, KEY);
		System.out.println(index);
	}
	
	
	private static int search(int A[], int l, int r, int KEY) {
		while (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				r = mid-1;
			else
				l = mid+1;
			
		}
		return -1;
	}
	
}
