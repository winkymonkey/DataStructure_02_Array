package com.example.datastructure.howtoapply.b_rotation;

/**
 * *************************************************************************
 * Search find PIVOT in a sorted and rotated array
 * *************************************************************************
 * I/P: {5, 6, 7, 8, 9, 10, 1, 2, 3};	O/P: 10
 * I/P: {40, 10, 20, 30};				O/P: 40
 * 
 * TIME - O(log n)
 * SPACE - O(1)
 * *************************************************************************
 */
public class A03_sortedRotated_findPivot {
	/*
	 * FUNC(l, h) {
	 * 		m = (l+h)/2
	 * 		if(A[m] > A[m+1])
	 * 			//it's increasing sequence
	 * 			if(A[mid] > A[0])
	 * 				//it's Left-Increasing-Sequence, go to further right
	 * 				return FUNC(m+1, h);
	 * 			else
	 * 				//it's Right-Increasing-Sequence, go to further left
	 * 				return FUNC(l, mid-1);
	 * 		else
	 * 			//it's pivot
	 * 			return m-1;
	 * }
	 */
}

