/*

Problem Name : Coin Change

Link : https://practice.geeksforgeeks.org/problems/coin-change2448/0

*/


class Solution {
    public long count(int coins[], int N, int sum) {
        long dp [] = new long [sum+1];
        dp[0] = 1;
        for(int c : coins) for(int j = c; j <= sum; j++) dp[j] += dp[j-c];
        return dp[sum];
    }
}