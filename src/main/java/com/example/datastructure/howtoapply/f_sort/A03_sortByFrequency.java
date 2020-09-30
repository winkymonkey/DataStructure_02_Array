package com.example.datastructure.howtoapply.f_sort;

/**
 * *****************************************************************************
 * Sort elements by frequency
 * *****************************************************************************
 * I/P: {2, 5, 2, 8, 5, 6, 8, 8}
 * O/P: {8, 8, 8, 2, 2, 5, 5, 6}
 * 
 * I/P: {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
 * O/P: {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 * 
 * *****************************************************************************
 */
public class A03_sortByFrequency {
	/*
	 * -----------------
	 * ---USE SORTING---
	 * -----------------
	 * Use Modified Merge Sort
	 * 	 Final array will store 'indexes of sorted elements' instead of 'sorted elements'.
	 * 	 ARR--- {2 5 2 8 5 6 8 8}		SORTED ARR--{2 2 5 5 6 8 8 8}		FINAL ARRAY---{0 2 1 4 5 3 6 7}
	 * 	 INDEX-- 0 1 2 3 4 5 6 7		OLD INDEX--- 0 2 1 4 5 3 6 7
	 * 
	 * 
	 * Now construct a 2D array from FINAL ARRAY
	 * 	  Index	  Count
	 * 		1		2
	 * 		0		2
	 * 		5		1
	 * 		3		3
	 * 
	 * Sort by count (consider indexes in case of tie)
	 * 	Index	Count
	 * 	  3		  3
	 *    0		  2
	 *    1		  2
	 *    5		  1
	 * 
	 * Print the elements using indexes in the above 2D array.
	 * TIME -- O(log n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USE BST & SORTING---
	 * -----------------------
	 * Each Node should look like below
	 * Class Node {
	 * 	  int key;				//store array element 
	 * 	  int original_index;	//store array element's index
	 * 	  int count;			//store array element's frequency
	 * }
	 * 
	 * Insert element in BST. (maintain key, original_index, count)
	 * If an element is already present then do 'count++' of that Node.
	 * Now construct a 2D array to store original_index & count.
	 * Sort the 2D array according to 'count'
	 * 
	 * TIME -- O(log n)
	 * SPACE -- O(log n)
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * 1.for each elements in array, store the element in HashMap.
	 * 2.HashMap's key is the 'array element' & value is the 'frequency'.
	 * 3.Sort the HashMap according to values.
	 * 
	 */
}
