package com.example.datastructure.core;

import java.util.Arrays;


public class B02_InsertionSort {
	private static B02_InsertionSort obj = new B02_InsertionSort();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.insertionSort(A);
	}
	
	
	/**
	 * Traverse from start+1 to end
	 *  - declare current element as KEY
	 *  - right shift all smaller elements before it to create a slot for KEY
	 *  - place KEY at the slot
	 * Traverse from start+2 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * Traverse from start+3 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * .....
	 * .....
	 */
	private void insertionSort(int[] A) {
		for (int i=1; i<A.length; i++) {		//Traverse from start+1 to end
			int KEY = A[i];
			int k = i-1;
			
			while (k>=0 && A[k]>KEY) {	//if current element > KEY
				A[k+1] = A[k];			//right shift the elements
				k--;
			}
			A[k+1] = KEY;				//place KEY at the slot
		}
		System.out.println(Arrays.toString(A));
	}
	
	
	/**
	 * --------------------------
	 * 		TIME COMPLEXITY
	 * --------------------------
	 * We have seen that for input size of 'n', we do (n-1) comparisons and (n-1) movements for each element.
	 * And the above comparison & movement logic are applied for all (n-1) elements of the array.
	 * We can try to improve the complexity by changing the comparison and movement logic
	 * 
	 * |--------------------------------------------------------------------------|----------------------|
	 * |                                for each element                          |  for (n-1) elements  |
	 * |--------------------------------------------------------------------------|----------------------|
	 * |                          |  COMPARISON  |   MOVEMENT   |      TOTAL      |        TOTAL         |
	 * |--------------------------|--------------|--------------|-----------------|----------------------|
	 * | REGULAR                  |     O(n)     |     O(n)     | = O(n)+O(n)     |  = (n-1) * O(n)      |
	 * |                          |              |              | = O(n)          |  = O(n^2)            |
	 * |--------------------------|--------------|--------------|-----------------|----------------------|
	 * | COMPARISON               |   O(log n)   |     O(n)     | = O(log n)+O(n) |  = (n-1)*O(log n)    |
	 * | (using binary search to  |              |              | = O(n)          |  = O(n^2)            |
	 * | reduce comparison time)  |              |              |                 |                      |
	 * |--------------------------|--------------|--------------|-----------------|----------------------|
	 * | MOVEMENT                 |     O(n)     |     O(1)     | = O(n)+O(1)     |  = (n-1)*O(n)        |
	 * | (using double linked list|              |              | = O(n)          |  = O(n^2)            |
	 * | to reduce movement time  |              |              |                 |                      |
	 * |--------------------------|--------------|--------------|-----------------|----------------------|
	 * 
	 * So we can see that whatever we do, we are unable to improve complexity of Insertion sort
	 * 
	 * 
	 * --------------------------
	 *      SPACE COMPLEXITY
	 * --------------------------
	 * Whatever be the input size, we only need one extra variable KEY to store the current element
	 * Hence the Space complexity is O(1)
	 * As it doesn't require any extra space, this type of sorting is also called In-Place Sorting
	 * 
	 */
}
