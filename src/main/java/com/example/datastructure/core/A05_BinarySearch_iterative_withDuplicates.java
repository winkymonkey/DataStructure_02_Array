package com.example.datastructure.core;


public class A05_BinarySearch_iterative_withDuplicates {

	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 10, 10, 10, 40 };
		//			0  1  2  3   4   5   6   7
		int KEY = 20;
		int leftIindex = searchLeftIndex(A, 0, A.length-1, KEY);
		int rightIindex = searchRightIndex(A, 0, A.length-1, KEY);
		
		if(KEY == A[leftIindex] && KEY == A[rightIindex]) {
			System.out.println(leftIindex);
			System.out.println(rightIindex);
		}
		else {
			System.out.println("Not found");
		}
	}

	private static int searchLeftIndex(int A[], int left, int right, int KEY) {
		while (right - left > 1) {
			int mid = (left + right) / 2;
			
			if (KEY <= A[mid])			//in both 'greaterThan' & 'equals' cases we do the same
				right = mid;
			else
				left = mid;
		}
		return right;
	}
	
	private static int searchRightIndex(int A[], int left, int right, int KEY) {
		while (right - left > 1) {
			int mid = (left + right) / 2;
			
			if (KEY >= A[mid])			//in both 'greaterThan' & 'equals' cases we do the same
				left = mid;
			else
				right = mid;
		}
		return left;
	}

}
