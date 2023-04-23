/*

Problem Name : Maximum path sum in matrix

Link : https://practice.geeksforgeeks.org/problems/path-in-matrix3805/0

*/


class Solution{
    static int maximumPath(int n, int dp[][]) {
        int ans = dp[0][0];
        for(int i = 1 ; i < n; i++) for(int j = 0; j < n; j++) {
            if(j == 0) dp[i][j] += Math.max(dp[i-1][j+1], dp[i-1][j]);
            else if (j == n-1) dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
            else dp[i][j] += Math.max(Math.max(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1]);
            if(i == n-1 && ans < dp[i][j]) ans = dp[i][j];
        }
        return ans;
    }
}