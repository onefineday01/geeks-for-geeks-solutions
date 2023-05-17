/*

Problem Name : Maximum sum Rectangle

Link : https://practice.geeksforgeeks.org/problems/maximum-sum-rectangle2948/1

*/


class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < R; i++) {
            int arr[] = new int[C];
            for(int j = i; j < R; j++) {
               for(int k = 0; k < C; k++) {
                   arr[k] += M[j][k];
                }
                ans = Math.max(ans, kadaneMaximumSum(arr, C));
            }
        }
        return ans;
    }
    int kadaneMaximumSum(int arr[], int n) {
        int maxSoFar = arr[0], max = arr[0];
        for(int i = 1; i < n; i++) {
            maxSoFar = Math.max(maxSoFar + arr[i], arr[i]);
            max = Math.max(max, maxSoFar);
        }
        return max;
    }
}