package com.example.datastructure.howtoapply.a_search4;

/**
 * *****************************************************************************
 * Majority Element
 * *****************************************************************************
 * An element that appears more than n/2 times in an array A[] of size n is called Majority Element.
 * Write a function which takes an array and prints the majority element(if exists), 
 * *****************************************************************************
 * I/P: {3, 3, 4, 2, 4, 4, 2, 4, 4}
 * O/P: 4
 * 
 * I/P: {3, 3, 4, 2, 4, 4, 2, 4}
 * O/P: No Majority Element
 * 
 * *****************************************************************************
 */
public class A02_findMajority {
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 * 	 if(HASHMAP.containsKey(A[i])) {
	 * 		value = HASHMAP.get(A[i]);
	 * 		HASHMAP.put(A[i], value++)
	 * 	 }
	 * 	 else {
	 * 		HASHMAP.put(A[i], 0)
	 * 	 }
	 * }
	 * TIME -- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * ---------------
	 * ---USING BST---
	 * ---------------
	 * Each node will contain one extra variable (count) along with existing (key, left-child, right-child)
	 * for (i=0 to n-1) {
	 * 	 if(A[i] exists in BST) {
	 * 		currenntNode.count++
	 * 	 }
	 * 	 else {
	 * 		//insert A[i] in proper place in tree
	 * 		if(currentNode.count == n/2){
	 * 			return;
	 * 		}
	 * 	 }
	 * }
	 * TIME -- O(n^2)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * ------------------------------
	 * --SELF BALANCING BINARY TREE--
	 * ------------------------------
	 * same as above
	 * TIME -- O(n * log n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * ----------------------------
	 * --MOORE'S VOTING ALGORITHM--
	 * ----------------------------
	 * TODO
	 * 
	 */
}
