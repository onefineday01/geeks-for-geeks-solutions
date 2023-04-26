/*

Problem Name : Find whether path exist

Link : https://practice.geeksforgeeks.org/problems/find-whether-path-exist5238/1

*/


class Solution
{
    int dp[][];
    public boolean is_Possible(int[][] arr)
    {
        int n = arr.length;
        int[] source = new int[2], destination = new int[2];
        dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    arr[i][j] = 3;
                    source[0] = i;
                    source[1] = j;
                } else if(arr[i][j] == 2) {
                    destination[0] = i;
                    destination[1] = j;
                }
                dp[i][j] = arr[i][j];
            }
        }
        dfs(source[0], source[1], dp, n);
        return dp[destination[0]][destination[1]] == 5;
    }
    
    void dfs(int i, int j, int dp[][], int n) {
        if(dp[i][j] != 3) {
            return;
        }
        dp[i][j] = 4;
        if(i-1 >= 0){
            if(dp[i-1][j] == 2) {
                dp[i-1][j] = 5;
                return;
            }
            if(dp[i-1][j] == 3) {
                dfs(i-1, j, dp, n);
            }
        }
        if(j-1 >= 0){
            if(dp[i][j-1] == 2) {
                dp[i][j-1] = 5;
                return;
            }
            if(dp[i][j-1] == 3) {
                dfs(i, j-1, dp, n);
            }
        }
        if(i+1 < n){
            if(dp[i+1][j] == 2) {
                dp[i+1][j] = 5;
                return;
            }
            if(dp[i+1][j] == 3) {
                dfs(i+1, j, dp, n);
            }
        }
        if(j+1 < n){
            if(dp[i][j+1] == 2) {
                dp[i][j+1] = 5;
                return;
            }
            if(dp[i][j+1] == 3) {
                dfs(i, j+1, dp, n);
            }
        }
        return;
    }
}