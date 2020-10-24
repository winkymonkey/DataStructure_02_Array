package com.example.datastructure.howtoapply.b_rotation;

/**
 * *************************************************************************
 * Search an element in a sorted and rotated array
 * *************************************************************************
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 80;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 100;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 50;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 3;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 33;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		KEY = 111;
 * 
 * *************************************************************************
 */
public class A04_sortedRotated_search {
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
	 * Find pivot in O(log n) time
	 * if (A[0]<KEY && KEY<pivot) {
	 *    binary search in left segment		//KEY is present in left segment 
	 * }
	 * else {
	 *    binary search in left segment		//KEY is present in right segment
	 * }
	 * 
	 * TIME --- O(log n) + O(log n) + O(log n) = O(log n)
	 * SPACE -- O(1)
	 * 
	 */
}
