package com.example.datastructure.core;

/**
 * *****************************************************************************
 * Search, insert and delete in an unsorted array
 * *****************************************************************************
 */
public class A01_searchInsertDelete_unsortedArr {
	/*
	 * --SEARCH--
	 * linearly search for an element in O(n) time
	 * total time O(n)
	 * 
	 * 
	 * --INSERT AT LAST--
	 * insert after last index in O(1) time
	 * total time O(1)
	 * 
	 * --INSERT AT FIRST--
	 * traverse the array from end to start and right shift each element by one position in O(n) time
	 * insert new element at first index in O(1) time
	 * total time O(n)
	 * 
	 * --INSERT AT GIVEN INDEX--
	 * traverse the array from end to the given index and right shift each element by one position in O(n) time
	 * insert new element at the given index in O(1) time
	 * total time O(n)
	 * 
	 * 
	 * --DELETE A GIVEN ELEMENT--
	 * first search the given element in O(n) time
	 * then left-shift all elements to its right in O(n) time
	 * total time O(n)
	 * 
	 */
}
