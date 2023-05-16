/*

Problem Name : Buy Stock with Transaction Fee

Link : https://practice.geeksforgeeks.org/problems/buy-stock-with-transaction-fee/0

*/


class Solution{
    public long maximumProfit(long prices[], int N, int fee){
        long buy = prices[0] * -1, sell = 0;
        for(int i = 1; i < N; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, prices[i] + buy - fee);
        }
        return sell;
    }
}