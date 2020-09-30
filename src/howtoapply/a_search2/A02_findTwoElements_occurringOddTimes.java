package howtoapply.a_search2;

/**
 * *****************************************************************************
 * Find the two numbers with odd occurrences in an unsorted array
 * *****************************************************************************
 * I/P: {12, 23, 34, 12, 12, 23, 12, 45}
 * O/P: 34 and 45
 * 
 * I/P: {10, 20}
 * O/P: 10 and 20
 * 
 * *****************************************************************************
 */
public class A02_findTwoElements_occurringOddTimes {
	/*
	 * ---------------
	 * ---USING XOR---
	 * ---------------
	 * ::STEP-1::
	 * X1 = XOR of array elements
	 * As only two elements(P, Q) occurs odd number of times,
	 * 	all even occurring elements will be canceled out (a^a=0 and 0^a=a)
	 * So the X1 will be P^Q
	 * 
	 * 
	 * ::STEP-2::
	 * We will pick rightmost 'set-bit' of X1 and divide the A[] in two groups.
	 * -- One group will have corresponding bit as 1
	 * -- Another group will have corresponding bit as 0
	 * 
	 * If we XOR the first group, we will get one odd occurring element
	 * If we XOR the second group, we will get another odd occurring element
	 * 
	 */
}
