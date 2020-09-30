package com.example.datastructure.core;

/**
 * *****************************************************************************
 * Sort N objects colored red, white or blue in such a way that 
 * 	 objects of the same color are adjacent, with the colors in the order red, white & blue.
 * The problem is closely related to the partition operation of quick sort.
 * The attribute need not be a 'color',
 * 	 but can be 'greater than the median'/'leading digit is zero'/whatever property you care to choose.
 * 
 * *****************************************************************************
 */
public class B06_DutchNationalFlagAlgorithm {
	/*
	 * ----------------------------
	 * ---TWO COLORS (zero, one)---
	 * ----------------------------
	 * In each step we try to push all ZEROS to left and all ONES to right.
	 * The algorithm maintains three sections (possibly empty) in A[]
	 * 		A[1...L-1] are all ZEROS
	 * 		A[L.....H] are all UNKNOWN
	 * 		A[H+1...N] are all ONES
	 * 
	 * The unknown section is shrunk while maintaining these conditions:
	 * 	L=1, H=1
	 * 	while(L<=H){
	 * 		if(A[L]==0)
	 * 			L++
	 * 		else
	 * 			swap A[L], A[H]
	 * 			H--
	 * 	}
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---THREE COLORS (zero, one, two)---
	 * -----------------------------------
	 * In each step we try to push all ZEROS to left, all ONES to middle and all TWOS to right.
	 * The algorithm maintains three sections (possibly empty) in A[]
	 * 		A[1...L-1] are all ZEROS (red)
	 * 		A[L...M-1] are all ONES (white)
	 * 		A[M.....H] are all UNKNOWN
	 * 		A[H+1...N] are all TWOS (blue)
	 * 
	 * The unknown section is shrunk while maintaining these conditions:
	 * 	L=1, M=1, H=N
	 * 	while(M<=H){
	 * 		if(A[M]==0)
	 * 			swap A[L], A[M]
	 * 			L++; M++;
	 * 		if(A[M]==1)
	 * 			M++;
	 * 		if(A[M]==2)
	 * 			swap A[M], A[H]
	 * 			H--;
	 * 	}
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
