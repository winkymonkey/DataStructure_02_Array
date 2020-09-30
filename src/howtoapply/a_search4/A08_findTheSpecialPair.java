package howtoapply.a_search4;

/**
 * *****************************************************************************
 * Find number of pairs (x, y) in an array such that x^y > y^x
 * *****************************************************************************
 * I/P: X[]={2,1,6}
 * 		Y[]={1,5}
 * O/P: 3					//(2, 1),(2, 5) and (6, 1)
 * 
 * I/P: X[]={10,19,18}
 * 		Y[]={11,15,9};
 * O/P: 2					//(10, 11) and (10, 15)
 * 
 * *****************************************************************************
 */
public class A08_findTheSpecialPair {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for each element in X[], traverse Y[]
	 * and validate the condition
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * 		x^y > y^x
	 * ==>y.logx > x.logy
	 * ==>y/x > (log y)/(log x)
	 * The above inequality will be valid only if y>x
	 * 
	 * count=0;
	 * Sort Y[]
	 * for(i=0 to length of X[]){
	 * 	 //find the index(k) of the first element in Y[] which is greater than X[i]
	 * 	 //now if Y[k] is greater than X[i], then Y[k+1],Y[k+2],.... all will be greater than X[i]
	 * 	 //count = count + (n-k)
	 * }
	 * 
	 * TIME -- O(nLogn + mLogn)
	 * 
	 */
}
