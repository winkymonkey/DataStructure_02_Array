package com.example.datastructure.howtoapply.h_misc;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Count the number of possible triangles
 * *****************************************************************************
 * Given an unsorted array of positive integers
 * Find the number of triangles that can be formed with 3 different array elements as 3 sides of triangles
 * A triangle will only be possible from 3 values if (value1 + value2 > value3)
 *  
 * *****************************************************************************
 * Input:  {4, 6, 3, 7}
 * Output: 3				//possible triangles -- {3, 4, 6}, {4, 6, 7}, {3, 6, 7}		{3, 4, 7} is not possible
 * 
 * Input:  {10, 21, 22, 100, 101, 200, 300}
 * Output: 6				//possible triangles -- {10,21,22}, {21,100,101},{22,100,101},{10,100,101},{100,101,200},{101,200,300}
 * 
 * *****************************************************************************
 */
public class H01_countNumberOfTriangles {
	/*
	 * First sort the array in ascending order
	 * Then use two loops. The outer loop (i) to fix the first side & inner loop (j) to fix the second side
	 * Now find the farthest index of the third side (k) whose length is less than sum of the other two sides
	 * So a range of values third sides can be found, where it is guaranteed that its length if greater than the other individual sides but less than the sum of both sides.
	 */
	public static void main(String[] args) {
		int A[] = { 10, 21, 22, 100, 101, 200, 300 };
		findNumberOfTriangles(A);
	}
	
	static void findNumberOfTriangles(int A[]) {
		int n = A.length;
		int count = 0;
		Arrays.sort(A);

		for (int i=0; i<n-2; ++i) {
			for (int j=i+1; j<n; ++j) {
				int k = i+2;
				
				// Find the rightmost element which is smaller than the sum of two fixed elements A[i] and A[j]
				while (k<n && A[i]+A[j]>A[k])
					++k;

				// The two fixed elements are A[i] and A[j]
				// All elements between A[j+1] to A[k-1] can form a triangle with A[i] and A[j]
				// So total number of possible triangles that can be formed with the two fixed elements is (k-j-1)
				// The 1 is subtracted from k because k is incremented one extra in above while loop.
				if (k > j)
					count += k-j-1;
			}
		}
		System.out.println(count);
	}
}
