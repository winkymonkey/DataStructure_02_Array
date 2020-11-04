package com.example.datastructure.howtoapply.j_optimize;

/**
 * *****************************************************************************
 * Maximum profit by buying and selling a share at most twice
 * *****************************************************************************
 * In a daily share trading, a buyer buys shares in the morning and sells it on the same day.
 * If the trader is allowed to make at most 2 transactions in a day,
 * whereas the second transaction can only start after the first one is complete (Sell->buy->sell->buy)
 * Given stock prices throughout the day, find out the maximum profit that a share trader could have made.
 * 
 * *****************************************************************************
 * Input:   price[] = {10, 22, 5, 75, 65, 80}
 * Output:  87
 * 			[buy at 10, sell at 22], [buy at 5, sell at 80]
 * 
 * 
 * Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
 * Output:  100
 * 			[buy at price 2, sell at 30], [buy at 8, sell at 80]
 * 
 * 
 * Input:   price[] = {100, 30, 15, 10, 8, 25, 80}
 * Output:  72
 * 			[buy at price 8, sell at 80]
 * 
 * 
 * Input:   price[] = {90, 80, 70, 60, 50}
 * Output:  0
 * 			[Not possible to earn]
 * 
 * *****************************************************************************
 */

public class J05_maximumProfitByByingSellingShareAtMostTwice {
	/*
	 * profit1 = 0, profit2 = 0
	 * 
	 * min = 0
	 * for (i=0 to n) {
	 *    if (A[i] > A[i+1])
	 *       min = A[i+1]
	 *    else
	 *       break;
	 * }
	 * 
	 * max = 0
	 * for (j=i to n) {
	 *    if (A[i] < A[i+1])
	 *       max = A[i+1]
	 *    else
	 *       break;
	 * }
	 * 
	 * profit = max-min
	 * 
	 * store highest of (profit, profit1, profit2) in profit1, and second highest of (profit, profit1, profit2) in profit2
	 * 
	 * repeat the same process twice as a max of two transaction is allowed
	 * 
	 */
}
