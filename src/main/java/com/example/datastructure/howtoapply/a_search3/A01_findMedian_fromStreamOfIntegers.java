package com.example.datastructure.howtoapply.a_search3;

/**
 * *****************************************************************************
 * Median in a stream of integers (running integers)
 * *****************************************************************************
 * When the input size is odd, we take the middle element of sorted data 
 * If the input size is even, we pick average of middle two elements in sorted stream
 * *****************************************************************************
 * STREAM: 5, 15, 1, 3
 * 		After reading 1st element of stream - 5 -> median - 5
 * 		After reading 2nd element of stream - 5, 15 -> median - 10
 * 		After reading 3rd element of stream - 5, 15, 1 -> median - 5
 * 		After reading 4th element of stream - 5, 15, 1, 3 -> median - 4
 * 
 * *****************************************************************************
 */
public class A01_findMedian_fromStreamOfIntegers {
	/*
	 * --------------------
	 * ---INSERTION SORT---
	 * --------------------
	 * If we can sort the data as it appears, we can easily locate median element.
	 * Insertion Sort is one such online algorithm that sorts the data appeared so far.
	 * 
	 * 
	 * 
	 * ---------------------------------
	 * ---Augmented Self-Balanced-BST---
	 * ---------------------------------
	 * 
	 * 
	 * 
	 * -----------
	 * ---HEAPS---
	 * -----------
	 * 
	 * 
	 */
}
