package com.LeetCode.April.Ninth;

//剑指 Offer 63. 股票的最大利润

public class Solution2 {
    public int maxProfit(int[] prices){
        if (prices.length == 0) return 0;
        int profit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min ,prices[i - 1]);
            profit = Math.max(profit ,prices[i] - min);
        }
        return profit;
    }
}
