package com.example.datastructure.howtoapply.e_merge;

/**
 * *****************************************************************************
 * Merge an array of size n into another array of size m+n
 * *****************************************************************************
 * I/P: MN[]={2, 8, -1, -1, -1, 13, -1, 15, 20}		//-1 means empty
 * 		N[] ={5, 7, 9, 25}
 * O/P: {2, 5, 7, 8, 9, 13, 15, 20, 25}
 * 
 * *****************************************************************************
 */

public class E01_merge_twoArraysIntoOneArray {
	/*
	 * -------------------------
	 * ---USING ANOTHER ARRAY---
	 * -------------------------
	 * take another array FINAL[] of size m+n
	 * k = 0;	//track indexes of FINAL[]
	 * i = 0;	//traverse MN[]
	 * j = 0;	//traverse N[]
	 * 
	 * while (i<m+n || j<n) {		//until both arrays are empty
	 * 	 while (MN[i] == -1)
	 * 		i++;
	 * 	 while (N[j] == -1)
	 * 		j++;
	 * 	 
	 * 	 if (MN[i]<N[j]) {
	 * 		FINAL[k]=MN[i]
	 * 		k++; i++;
	 * 	 }
	 * 	 else {
	 * 		FINAL[k]=N[j]
	 * 		k++; j++;
	 * 	 }
	 * }
	 * 
	 * 
	 * 
	 * --------------------
	 * ---IN PLACE MERGE---
	 * --------------------
	 * Right-shift all POSITIVE elements of MN[] to the extreme right of MN[] array.
	 * 		{2, 8, -1, -1, -1, 13, -1, 15, 20}	becomes
	 * 		{-1, -1, -1, -1, 2, 8, 13, 15, 20}
	 * Keep N[] intact.
	 * 		{5, 7, 9, 25}
	 * 
	 * i = index of first POSITIVE element in MN[]	//index of '2' in MN[]
	 * j = index of first POSITIVE element in N[]	//index of '5' in N[]
	 * k = 0
	 * 
	 * for (k=0 to m+n) {
	 * 	 //put smallest element of these two into MN[k]
	 * 	 if (MN[i] < N[j])
	 * 		MN[k] = MN[i];
	 * 		i++;
	 * 	 if (MN[i] > N[j])
	 * 		MN[k] = MN[j];
	 * 		j++;
	 * }
	 * 
	 */
}
