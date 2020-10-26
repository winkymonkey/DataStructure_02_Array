package com.example.datastructure.howtoapply.c_optimize;

/**
 * *****************************************************************************
 * Maximum Sub Array Sum Excluding Certain Elements
 * *****************************************************************************
 * I/P: A[]={1, 7, -10, 6, 2}
 * 		B[]={5, 6, 7, 1}
 * O/P: 2						//{2}
 * 
 * I/P: A[]={3, 4, 5, -4, 6}
 * 		B[]={1, 8, 5}
 * O/P: 7						//{3,4}
 * 
 * *****************************************************************************
 */
public class J02_largestSumContiguousSubarray_excludingFew {
	/*
	 * ---------------------------------
	 * ---MODIFIED KADANE'S ALGORITHM---
	 * ---------------------------------
	 * It's modified version of Kadane's algorithm.
	 * In legacy approach,
	 * 	 We reset sum=0; when sum<0
	 * In this problem,
	 * 	 We will reset sum=0; when sum<0 OR A[i] exists in B[]
	 * 
	 * MAX = 0;
	 * sum = 0;
	 * for(i=0 to length) {
	 * 	 sum = sum + A[i]
	 *   if(sum < 0 || A[i] belongs to B[])	----> //only modification is in this line
	 *   	sum = 0;
	 *   
	 *   if(sum > MAX)
	 *   	MAX = sum;
	 * }
	 * return MAX;
	 * 
	 */
}
