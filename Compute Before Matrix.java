/*

Problem Name : Compute Before Matrix

Link : https://practice.geeksforgeeks.org/problems/85781966a9db2a1ac17eaaed26a947eba5740d56/1

*/


class Solution{
    public int[][] computeBeforeMatrix(int n, int m,int[][] after ){
        for(int i = n-1 ; i > 0; i--) {
            for(int j = m - 1; j > 0; j--) {
                after[i][j] -=  (after[i-1][j] + after[i][j-1]) - after[i-1][j-1];
            }
        }
        for(int i = m-1; i > 0; i--) {
            after[0][i] -= after[0][i-1]; 
        }
        for(int i = n-1; i > 0; i--) {
            after[i][0] -= after[i-1][0]; 
        }
        return after;
    }
}