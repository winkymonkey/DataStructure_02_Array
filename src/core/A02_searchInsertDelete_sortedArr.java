package core;

/**
 * *****************************************************************************
 * Search, insert and delete in a sorted array
 * *****************************************************************************
 */
public class A02_searchInsertDelete_sortedArr {
	/*
	 * -SEARCH-
	 * search using binary search in O(log n) time
	 * total time O(log n)
	 * 
	 * -INSERT-
	 * find out the expected position of the NEW element in O(log n) time
	 * then right-shift all elements of right side in O(n) time
	 * then insert it at its desired place O(1) time
	 * total time O(n)
	 * 
	 * -DELETE-
	 * search the element using binary search in O(log n) time
	 * left-shift all elements to its right in O(n) time
	 * total time O(n)
	 */
}
