package core;

import java.util.Arrays;



public class B01_BubbleSort {
	private static B01_BubbleSort obj = new B01_BubbleSort();
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		obj.bubbleSort(A, A.length);
	}
	
	
	/* In each traversal, shift largest element to extreme right & fix that position.
	 * next time run loop from start to second-last as so on
	 */
	private void bubbleSort(int[] A, int len) {
		int temp;
		for(int i=0; i<len; i++) {
			for(int j=1; j<len-i; i++) {
				if(A[j-1] > A[j]) {
					//swap
					temp = A[j-1];  
                    A[j-1] = A[j];  
                    A[j] = temp;  
				}
			}
		}
		System.out.println(Arrays.toString(A));
	}
}
