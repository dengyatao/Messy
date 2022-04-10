package com.LeetCode.April.Ninth;

//剑指 Offer 10- II. 青蛙跳台阶问题
//斐波那契数列问题，动态规划

public class Solution1 {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
