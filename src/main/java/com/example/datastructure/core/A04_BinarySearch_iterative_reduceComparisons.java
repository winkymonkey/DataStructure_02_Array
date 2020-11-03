package com.example.datastructure.core;


public class A04_BinarySearch_iterative_reduceComparisons {

	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//			0  1  2  3   4
		int KEY = 10;
		int index = search(A, 0, A.length-1, KEY);
		System.out.println(index);
	}

	private static int search(int A[], int left, int right, int KEY) {
		while (right - left > 1) {
			int mid = (left + right) / 2;
			
			if (KEY >= A[mid])			//if Key >= A[mid] modify left
				left = mid;
			else
				right = mid;
		}
		
		if (KEY == A[left])
			return left;
		if (KEY == A[right])
			return right;
		else
			return -1;
	}

}
