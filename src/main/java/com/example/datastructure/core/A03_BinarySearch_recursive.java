package com.example.datastructure.core;


public class A03_BinarySearch_recursive {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		int X = 10;
		
		System.out.println(search(A, 0, A.length-1, X));
	}
	
	private static int search(int A[], int left, int right, int X) {
		if(left <= right) {
			int mid = (left+right)/2;
			
			if(X == A[mid])
				return mid;
			
			if(X < A[mid])
				return search(A, left, mid-1, X);
			else
				return search(A, mid+1, right, X);
				
		}
		else {
			return -1;
		}
	}
}
