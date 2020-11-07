package com.example.datastructure.a_core;


public class A02_BinarySearch_recursive {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//	   	    0  1  2  3   4
		int KEY = 10;
		
		int index = search(A, 0, A.length-1, KEY);
		System.out.println(index);
	}
	
	
	private static int search(int A[], int l, int r, int KEY) {
		if (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				return search(A, l, mid-1, KEY);
			else
				return search(A, mid+1, r, KEY);
				
		}
		return -1;
	}
	
}
