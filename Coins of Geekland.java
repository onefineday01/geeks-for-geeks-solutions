/*

Problem Name : Coins of Geekland

Link : https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/0

*/



class Solution
{
    public int Maximum_Sum(int mat[][],int n,int k){

        int dp[][] = new int[n][n];

        for(int i= 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = mat[i][j];
                } else if(i == 0) {
                    dp[i][j] = dp[i][j-1] + mat[i][j];
                } else if(j == 0) {
                    dp[i][j] = dp[i-1][j] + mat[i][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mat[i][j];
                }
            }
        }
        
        int ans = dp[k-1][k-1];

        for(int i = k, j = k - 1; i < n; i++) {
            ans = Math.max(ans, dp[i][j] - dp[i-k][j]);
        }

        for(int i = k - 1, j = k; j < n; j++) {
            ans = Math.max(ans, dp[i][j] - dp[i][j-k]);
        }

        for(int i = k; i < n; i++) {
            for(int j = k; j < n; j++) {
                ans = Math.max(ans, dp[i][j] - dp[i-k][j] - dp[i][j-k] + dp[i-k][j-k]);
            }
        }

        return ans;
    }
}