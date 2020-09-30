package com.example.datastructure.howtoapply.g_misc;

/**
 * *****************************************************************************
 * Count frequencies of all elements in array in O(1) extra space and O(n) time
 * *****************************************************************************
 * I/P: {2, 3, 3, 2, 5}
 * O/P: 1 -> 0
 * 		2 -> 2
 * 		3 -> 2
 * 		4 -> 0
 * 		5 -> 1
 * 
 * I/P: {4, 4, 4, 4}
 * O/P: 1 -> 0
 * 		2 -> 0
 * 		3 -> 0
 * 		4 -> 4
 * 
 * *****************************************************************************
 */
class A03_countFrequency_withoutExtraSpace {
	public static void main(String[] args) {
		int arr[] = {2, 3, 3, 2, 5};
		int n = arr.length;
		printfrequency(arr, n);
	}
	
	
	
	private static void printfrequency(int A[], int n) {
		/*Subtract 1 from every element so that the elements become in range from 0 to n-1*/
		for (int j = 0; j < n; j++)
			A[j] = A[j] - 1;			//{1, 2, 2, 1, 4}
		
		
		/*Use every element A[i] as index and add 'n' to element present at 'A[i]%n' to keep track of count of occurrences of A[i]*/
		for (int i = 0; i < n; i++)
			A[A[i] % n] = A[A[i] % n] + n;
		
		
		/*Print the number of times 'n' was added at index corresponding to every element*/
		for (int i = 0; i < n; i++)
			System.out.println(i + 1 + "->" + A[i] / n);
	}
	
}
