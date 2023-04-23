/*

Problem Name : Kadane's Algorithm

Link : https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/0

*/

class Solution{

    long maxSubarraySum(int arr[], int n){
        int max = arr[0];
        int maxSoFar = arr[0];
        for(int i = 1; i < n; i++) {
            maxSoFar = Math.max(arr[i], arr[i] + maxSoFar);
            max = Math.max(maxSoFar, max);
        }
        return max;
    }
    
}