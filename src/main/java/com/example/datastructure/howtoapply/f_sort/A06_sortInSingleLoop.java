package com.example.datastructure.howtoapply.f_sort;

import java.util.Arrays;


public class A06_sortInSingleLoop {
	private static A06_sortInSingleLoop obj = new A06_sortInSingleLoop();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.sort(A);
	}
	
	
	private void sort(int A[]) {
		for(int i=0, j=i+1; i<A.length && j<A.length; ) {
			if(A[i] > A[j]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i=0;
				j=i+1;
			}
			else {
				i++;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(A));
	}
}
