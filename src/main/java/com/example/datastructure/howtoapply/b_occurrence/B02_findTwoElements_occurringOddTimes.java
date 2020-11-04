package com.example.datastructure.howtoapply.b_occurrence;

/**
 * *****************************************************************************
 * Find the two numbers with odd occurrences in an unsorted array
 * *****************************************************************************
 * Input:  {12, 23, 34, 12, 12, 23, 12, 45}
 * Output: 34 and 45
 * 
 * Input:  {10, 20}
 * Output: 10 and 20
 * 
 * *****************************************************************************
 */

public class B02_findTwoElements_occurringOddTimes {
	/*
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * X = XOR of all elements
	 * As only P and Q appears odd number of times, XOR among all other elements results 0 
	 * 
	 * Hence [X = P ^ Q]
	 *   -- if X is zero that means all elements are in pairs only
	 *   -- if X is non-zero that means a few elements are not in pairs
	 * 
	 * Now we want to find out the rightmost 'set-bit'(1) in X 			['set_bit_num = X & ~(X-1)'] 
	 *   -- as a XOR between two binary numbers can produce 1 in any bit position ONLY IF two bits are different at that position
	 *   -- the rightmost 'set-bit' signifies --> at that bit position P and Q have opposite value
	 * 
	 * So we have to divide elements in two groups in such a way that
	 *   -- groupA has those elements who's corresponding bit is 1
	 *   -- groupB has those elements who's corresponding bit is 0
	 *   
	 * To achieve it, we can traverse the array and perform 'A[i] & set_bit_num'	[A[i] & set_bit_num]
	 *   -- if the result > 0 that means --> A[i] has corresponding bit as 1
	 *   -- if the result < 0 that means --> A[i] has corresponding bit as 0
	 * 
	 * 
	 * 
	 * --------------
	 * X = 0
	 * for (i=0 to n-1) {
	 *    X = X ^ A[i]
	 * }
	 * set_bit_num = X & ~(X-1)
	 * 
	 * for (i=0 to n-1) {
	 *    if ((A[i] & set_bit_num) > 0)
	 *       P = P ^ A[i];
	 *    else
	 *       Q = Q ^ A[i]
	 * }
	 * print P and Q
	 * 
	 */
}
