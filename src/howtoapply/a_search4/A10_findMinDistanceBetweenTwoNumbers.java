package howtoapply.a_search4;
/**
 * *****************************************************************************
 * Find the minimum distance between two numbers
 * *****************************************************************************
 * Given an unsorted array A[] and two numbers X and Y.
 * Find the minimum distance between X and Y in A[].
 * The array might also contain duplicates.
 * You may assume that both X and Y are different and present in A[].
 * *****************************************************************************
 * I/P: A[]={1, 2}		 	X=1, Y=2
 * O/P: 1
 * 
 * I/P: A[]={3, 4, 5}		X=3, Y=5
 * O/P: 2
 * 
 * I/P: A[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}		X=3, Y=6
 * O/P: 4
 * 
 * I/P: A[] = {2, 5, 3, 5, 4, 4, 2, 3}					X=3, Y=2
 * O/P: 1
 * 
 * *****************************************************************************
 */
public class A10_findMinDistanceBetweenTwoNumbers {
	/*
	 * Traverse array from left side and stop if either A[i]==X or A[i]==Y
	 * Store index of this in 'k'
	 * Resume moving forward from index 'k'
	 * If A[i] matches with either X or Y then check if it is different from A[k].
	 * If it is different then update the minimum distance if needed.
	 * If it is same then update k (i.e. make k=i)
	 * -----------
	 * -----------
	 * min_dist = INFINITY;
	 * 
	 * for(i = 0; i < n; i++) {
	 * 	 if(A[i]==X || A[i]==Y) {
	 * 		k = i;
	 * 		break;
	 * 	 }
	 * }
	 * 
	 * while(i<n) {
	 * 	 if(A[i]==X || A[i]==Y) {
	 * 		if (A[k]!=A[i] && (i-k)<min_dist) {
	 * 			min_dist = i-k;
	 * 			k=i;
	 * 		}
	 * 		else {
	 * 			k=i;
	 * 		}
	 * 	 }
	 * }
	 * 
	 * TIME -- O(n)
	 */
}
