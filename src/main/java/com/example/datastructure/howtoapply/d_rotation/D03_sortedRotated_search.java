package com.example.datastructure.howtoapply.d_rotation;

/**
 * *************************************************************************
 * Search an element in a sorted and rotated array
 * *************************************************************************
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 80
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 100
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 50
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 3
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 33
 * Input:  {50, 60, 70, 80, 90, 100, 1, 2, 3}		KEY = 111
 * 
 * *************************************************************************
 */

public class D03_sortedRotated_search {
	/*
	 * ----------------------------
	 * ---LINEAR SEARCH APPROACH---
	 * ----------------------------
	 * NAIVE
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ----------------------------
	 * ---BINARY SEARCH APPROACH---
	 * ----------------------------
	 * Find pivot in O(Logn) time
	 * if (A[0]<KEY && KEY<pivot) {
	 *    binary search in left segment		//KEY is present in left segment 
	 * }
	 * else {
	 *    binary search in left segment		//KEY is present in right segment
	 * }
	 * 
	 * TIME --- O(Logn) + O(Logn) + O(Logn) = O(Logn)
	 * SPACE -- O(1)
	 * 
	 */
}
