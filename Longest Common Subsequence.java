/*

Problem Name : Longest Common Subsequence

Link : https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1

*/


class Solution {
    static int lcs(int x, int y, String s1, String s2) {
        int dp[][] = new int[x+1][y+1];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[x][y];
    }
    
}