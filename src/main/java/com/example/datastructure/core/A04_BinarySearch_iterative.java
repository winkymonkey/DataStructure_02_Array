package com.example.datastructure.core;


public class A04_BinarySearch_iterative {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		int X = 10;
		
		search(A, X);
	}
	
	private static void search(int A[], int X) {
		int left = 0;
		int right = A.length-1;
		
		while(left < right) {
			int mid = (left+right)/2;
			
			if(X == A[mid])
				System.out.println(mid);
			
			if(X < A[mid])
				right = mid-1;
			else
				left = mid+1;
		}
	}
}
