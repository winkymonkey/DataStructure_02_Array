package com.example.datastructure.howtoapply.b_rotation;

/**
 * *************************************************************************
 * Search an element in a sorted and rotated array
 * *************************************************************************
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 80;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 100;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 50;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 3;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 33;
 * I/P: {50, 60, 70, 80, 90, 100, 1, 2, 3};		key = 111;
 * 
 * TIME - O(log n)
 * SPACE - O(1)
 * *************************************************************************
 */
public class A04_sortedRotated_search {
	/*
	 * Find pivot in O(log n) time
	 * if(KEY> A[0]  AND  KEY<pivot)
	 * 		//present in left segment
	 * 		binary search in left segment 
	 * else
	 * 		//present in right segment
	 * 		binary search in left segment
	 * 
	 * TIME = O(log n) + O(log n) + O(log n) ~~ O(log n)
	 * SPACE = O(1)
	 */
}

