/*

Problem Name : Find the number of islands

Link : https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/0

*/


class Solution {
    // Function to find the number of islands.
    char[][] grid;
    public int numIslands(char[][] arr) {
        grid = arr;
        int n = grid.length, m = grid[0].length, ans = 0;
        for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) if(grid[i][j] == '1') {
            helper(i, j, n, m);
            ans++;
        }
        return ans;
    }
    void helper(int i, int j, int n, int m) {
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = 'a';
        helper(i+1, j-1, n, m);
        helper(i+1, j, n, m);
        helper(i+1, j+1, n, m);
        helper(i-1, j-1, n, m);
        helper(i-1, j, n, m);
        helper(i-1, j+1, n, m);
        helper(i, j+1, n, m);
        helper(i, j-1, n, m);
    }
}