package howtoapply.a_search1;

/**
 * *****************************************************************************
 * Given a sorted array and a number x, find the pair in array whose sum is closest to x
 * *****************************************************************************
 * I/P: A[] = {10, 22, 28, 29, 30, 40}		X = 54
 * O/P: 22 and 30
 * 
 * I/P: A[] = {1, 3, 4, 7, 10}				X = 15
 * O/P: 4 and 10
 * 
 * *****************************************************************************
 */
public class A03_findPair_whoseSumIsClosestToGivenValue {
	/*
	 * ----------------------------
	 * ---SLIDING DOOR TECHNIQUE---
	 * ----------------------------
	 * DIFF = INFINITY		//to store the difference between pair and X
	 * l = 0
	 * r = n-1
	 * 
	 * while(l < r){
	 * 	 SUM = A[l]+A[r];
	 * 
	 * 	 if(abs(A[l]+A[r]-SUM) < DIFF)
	 * 		//update DIFF and result
	 * 	 else if(A[l]+A[r] < SUM)
	 * 		l++
	 * 	 else
	 * 		r++
	 * }
	 * 
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
