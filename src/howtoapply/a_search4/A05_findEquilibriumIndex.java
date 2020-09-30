package howtoapply.a_search4;

/**
 * *****************************************************************************
 * Equilibrium index of an array
 * *****************************************************************************
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes 
 * is equal to the sum of elements at higher indexes.
 * *****************************************************************************
 * I/P: {-7 1 5 2 -4 3 0}
 * O/P: 3					//A[0]+A[1]+A[2] = A[4]+A[5]+A[6]
 * 
 * *****************************************************************************
 */
public class A05_findEquilibriumIndex {
	/*
	 * ---------------
	 * ---USING SUM---
	 * ---------------
	 * SUM = find sum of all elements in array in O(n) time
	 * 
	 * LEFTSUM=0
	 * for(i=0 to n-1){
	 * 	 LEFTSUM = LEFTSUM + A[i]
	 * 	 RIGHTSUM = SUM - LEFTSUM
	 * 	 
	 * 	 if(LEFTSUM == RIGHTSUM)
	 * 		print
	 * }
	 * 
	 */
}
