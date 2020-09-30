package howtoapply.a_search1;

/**
 * *****************************************************************************
 * Two elements whose sum is closest to zero
 * *****************************************************************************
 * An Array of integers is given (both +ve and -ve)
 * You need to find the two elements such that their sum is closest to zero.
 * *****************************************************************************
 * I/P: {1, 60, -10, 70, -80, 85}
 * O/P: -80 and 85
 * 
 * *****************************************************************************
 */
public class A02_findPair_whoseSumIsClosestToZero {
	/*
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array
	 * {-80, 10, 1, 60, 70, 85}
	 * 
	 * l=0
	 * r=n-1
	 * SUM = 0;
	 * while(l < r){
	 * 	 if(A[l]+A[r] > 0)
	 * 		r--;
	 * 	 else if(A[l]+A[r] < 0)
	 * 		l++;
	 * 	 
	 * 	 SUM = smaller between 'absolute(A[l]+A[r])' and 'SUM'
	 * }
	 * TIME -- O(n*log n) + O(n)~~O(n*log n)
	 * SPACE -- O(1)
	 * 
	 */
}
