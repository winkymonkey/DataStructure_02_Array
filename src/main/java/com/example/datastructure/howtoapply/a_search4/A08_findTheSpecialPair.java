package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Find number of pairs (x, y) in an array such that x^y > y^x
 * *****************************************************************************
 * Given two arrays X[] and Y[] of positive integers
 * find number of pairs such that x^y > y^x 
 * where x ε X[], y ε Y[]
 * *****************************************************************************
 * I/P: X[] = {2,1,6}
 * 		Y[] = {1,5}
 * O/P: 3					//(2, 1),(2, 5) and (6, 1)
 * 
 * I/P: X[] = {10,19,18}
 * 		Y[] = {11,15,9}
 * O/P: 2					//(10, 11) and (10, 15)
 * 
 * *****************************************************************************
 */
public class A08_findTheSpecialPair {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for each element in X[], traverse Y[]
	 * and validate the condition
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * x^y > y^x
	 * => y.logx > x.logy
	 * => y/x > (log y)/(log x)
	 * The above inequality will be valid only if y>x
	 * So the problem comes down to finding all x and y where y>x
	 * 
	 * But there are a few exceptions to this rule:
	 *  - If x=0, then count of possible y is '0'
	 *  - If x=1, then count of possible y is 'the frequency of 0’s is the Y[]'
	 *  - If x=2, then we cannot have a valid pair with y={2,3,4}... then the count of possible y is {0,1,5,6,......}
	 *  - If x=3, then we cannot have a valid pair with y={3}... then the count of possible y is {0,1,2,4,5,.....}
	 * ----------------
	 * IMPLEMENTATION-1
	 * ----------------
	 * count = 0
	 * Sort Y[]
	 * for(i=0 to X.length) {
	 * 	  //find the index 'k' of the first element in sorted Y[] which is greater than X[i]    (Use binary search)
	 * 	  //now if Y[k] is greater than X[i], then Y[k+1],Y[k+2],.... all will be greater than X[i]
	 * 	  //count = count + (Y.length-k)
	 * }
	 * ----------------
	 * IMPLEMENTATION-2
	 * ----------------
	 * SEE JAVA CODE
	 * 
	 * 
	 * TIME --- O(nLogn + mLogn)
	 * SPACE -- O(1)
	 * 
	 */
}
