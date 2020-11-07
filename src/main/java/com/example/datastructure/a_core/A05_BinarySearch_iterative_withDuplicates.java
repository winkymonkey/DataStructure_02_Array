package com.example.datastructure.a_core;


public class A05_BinarySearch_iterative_withDuplicates {

	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 10, 10, 10, 40 };
		//			0  1  2  3   4   5   6   7
		int KEY = 20;
		
		int leftIindex = searchLeftIndex(A, 0, A.length-1, KEY);
		int rightIindex = searchRightIndex(A, 0, A.length-1, KEY);
		
		if (KEY == A[leftIindex] && KEY == A[rightIindex]) {
			System.out.println(leftIindex);
			System.out.println(rightIindex);
		}
		else {
			System.out.println("Not found");
		}
	}
	
	
	private static int searchLeftIndex(int A[], int l, int r, int KEY) {
		while (r - l > 1) {				//max allowed position is back to back L,M,R
			int mid = (l + r) / 2;
			
			if (KEY <= A[mid])			//if KEY <= A[mid] modify right
				r = mid;
			else
				l = mid;
			
		}
		return r;
	}
	
	
	private static int searchRightIndex(int A[], int l, int r, int KEY) {
		while (r - l > 1) {				//max allowed position is back to back L,M,R
			int mid = (l + r) / 2;
			
			if (KEY >= A[mid])			//if KEY >= A[mid] modify left
				l = mid;
			else
				r = mid;
			
		}
		return l;
	}

}
