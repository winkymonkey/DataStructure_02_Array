package howtoapply.e_arrangement;

/**
 * ******************************************************************************************
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * ******************************************************************************************
 * An array contains both positive and negative numbers in random order. 
 * Rearrange the array elements so that positive and negative numbers are placed alternatively. 
 * Number of positive and negative numbers need not be equal. 
 * If there are more positive numbers, they appear at the end of the array. 
 * If there are more negative numbers, they too appear in the end of the array.
 * ******************************************************************************************
 * I/P: A[] = [-1, 2, -3, 4, 5, 6, -7, 8, 9]
 * O/P: A[] = [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * ******************************************************************************************
 */
public class A02_alternatePosAndNegNums {
	/*
	 * -------------------------
	 * ---MODIFIED QUICK SORT---
	 * -------------------------
	 * Positive & Negative numbers are distributed around 0
	 * So let us do "Partition Process Quick Sort" based on 'KEY'=0
	 * 
	 * i = -1;
	 * for(j=0 to length) {
	 *   if(A[j] < KEY) {
	 * 		i++;
	 * 		swap A[i] and A[j];
	 * 	 }
	 * 	 j++;
	 * }
	 * 
	 * All negative numbers will be left aligned, All positive numbers will be right aligned
	 * Now 'i' is pointing to the last negative number
	 * NEG = 0; 		//first negative number
	 * POS = i+1;		//first positive number
	 * 
	 * Increment the NEG by 2 and POS by 1 and swap
	 * (i.e. swap every alternate negative number with next positive number)
	 * 
	 * 
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 */
}
