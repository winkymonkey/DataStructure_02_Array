package com.example.datastructure.howtoapply.g_optimize;


public class G07A_minimumJumpsToReachEnd_bruteForce {
	/*
	 * Start from the first element and recursively call for all the elements reachable from first element.
	 * The minimum number of jumps to reach end from first can be calculated using 
	 * 'minimum number of jumps needed to reach end from the elements reachable from first'.
	 * 
	 * For input A[] = { 1, 3, 5, 8, 9 }, the recursion tree is as below
	 *                   0  1  2  3  4
	 * 
	 *                    min(0,4)
	 *                    /
	 *               ___min(1,4)___
	 *              /     \        \
	 *         min(2,4)  min(3,4)  min(4,4)
	 *         /    \         \
	 *    min(3,4) min(4,4)  min(4,4)
	 *      /
	 * min(4,4)
	 * 
	 * 
	 * TIME --- O(n^n)		//There are maximum 'n' possible ways to move from a element. For n elements it will be n^n.
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String args[]) {
		int A[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5, 3, 5, 2, 4, 7, 3, 3, 5, 7, 4, 4, 1, 2, 4, 2, 3, 6 };
		//			0  1  2  3  4  5  6  7  8  9  10
		int n = A.length;
		System.out.println(minJumps(A, 0, n-1));
	}
	
	private static int minJumps(int A[], int low, int high) {
		if (high == low)
			return 0;
		
		if (A[low] == 0)
			return -1;

		int min = Integer.MAX_VALUE;
		for(int i=low+1; i<=high && i<=low+A[low]; i++) {
			int jumps = minJumps(A, i, high);
			if(jumps < min) {
				min = jumps;
			}
		}
		return min+1;
	}
}
