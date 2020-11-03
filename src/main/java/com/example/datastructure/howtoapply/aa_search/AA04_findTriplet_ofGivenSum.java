package com.example.datastructure.howtoapply.aa_search;

/**
 * *****************************************************************************
 * Find a triplet that sum to a given value
 * *****************************************************************************
 * Input:  A[]={12, 3, 4, 1, 6, 9}		SUM = 24
 * Output: YES							//12,3,9
 * 
 * *****************************************************************************
 */

public class AA04_findTriplet_ofGivenSum {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for (i=0 to n-2)
	 *    for (j=i+1 to n-1)
	 *       for (k=j+1 to n)
	 *          if (A[i] + A[j] + A[k] == SUM)
	 *             return true
	 * 
	 * TIME --- O(n^3)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array		{1, 3, 4, 6, 9, 12}
	 * 
	 * for (i=0 to n-2) {						//fix the first element of the possible triplet, A[i]
	 *    l = i+1;
	 *    r = n-1;
	 *    while (l < r) {						//apply sliding door technique from (i+1) to (end)
	 *       if (A[i]+A[l]+A[r] == SUM)
	 *          return true
	 *       else if (A[i]+A[l]+A[r] < SUM)
	 *          l++
	 *       else if (A[i]+A[l]+A[r] > SUM) 
	 *          r--
	 * 	  }
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n^2) = O(n^2)
	 * SPACE -- O(1)
	 * 
	 */
}
