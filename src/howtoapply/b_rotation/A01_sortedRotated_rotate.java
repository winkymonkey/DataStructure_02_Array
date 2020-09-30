package howtoapply.b_rotation;

/**
 * ******************************************************************************
 * Write a function rotate(A[], d, n) that rotates A[] of size n by d elements.
 * ******************************************************************************
 * I/P: {10,20,30,40,50,60};		d = 2;
 * O/P: {30,40,50,60,10,20}
 * ******************************************************************************
 */
public class A01_sortedRotated_rotate {
	/*
	 * ---------------------
	 * --ROTATE ONE BY ONE--
	 * ---------------------
	 * For i = 0 to i < d
	 * 		Left rotate all elements of A[] by one
	 * 
	 * 
	 * 
	 * ------------------------------------
	 * --ROTATE USING GCD OF 'n' AND 'd'---
	 * ------------------------------------
	 * g = (GCD of n,d)
	 * Then left-shift between A[0], A[0+g], A[0+2g], ...
	 * Then left-shift between A[1], A[1+g], A[1+2g], ...
	 * ......
	 * Above process will continue as 0,1,2,...,g-1
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ---------------------------------
	 * ---ROTATE USING BLOCK REVERSAL---
	 * ---------------------------------
	 * First reverse A[0, d-1]
	 * Then reverse A[d, n-1]
	 * Then reverse A[0, n-1]
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
