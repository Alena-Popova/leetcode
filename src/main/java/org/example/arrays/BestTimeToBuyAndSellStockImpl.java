package org.example.arrays;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStockImpl
{
    /**
     * Constraints:
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     */
    public int maxProfit(int[] prices)
    {
        final int length = prices.length;
        int profit = 0;
        if (length <= 1)
        {
            return profit;
        }
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++)
        {
            if (prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > profit)
            {
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }
}
