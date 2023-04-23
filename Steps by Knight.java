/*

Problem Name : Steps by Knight

Link : https://practice.geeksforgeeks.org/problems/steps-by-knight5927/0

*/


import java.util.*;
import java.io.*;

public class Sample
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            int xs = sc.nextInt() - 1, ys = sc.nextInt() - 1, xt = sc.nextInt() - 1, yt = sc.nextInt() - 1;
            for(int i = 0; i < n; i++)
                Arrays.fill(arr[i], Integer.MAX_VALUE);
            dfs(arr, n, xs, ys, 0, xt, yt);
            System.out.println(arr[xt][yt]);
        }
    }
    static void dfs(int arr[][], int n, int i, int j, int curr, int xt, int yt){
        if(i < 0 || j < 0 || i >= n || j >= n) return;
        if(arr[i][j] <= curr) return;
        arr[i][j] = Math.min(arr[i][j], curr);
        if(i == xt && j == yt) return;
        dfs(arr, n, i-2, j-1, curr+1, xt, yt);
        dfs(arr, n, i-2, j+1, curr+1, xt, yt);
        dfs(arr, n, i+2, j-1, curr+1, xt, yt);
        dfs(arr, n, i+2, j+1, curr+1, xt, yt);
        dfs(arr, n, i+1, j-2, curr+1, xt, yt);
        dfs(arr, n, i-1, j-2, curr+1, xt, yt);
        dfs(arr, n, i+1, j+2, curr+1, xt, yt);
        dfs(arr, n, i-1, j+2, curr+1, xt, yt);
    }
}