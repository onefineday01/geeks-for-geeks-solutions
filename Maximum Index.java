/*

Problem Name : Maximum Index

Link : https://practice.geeksforgeeks.org/problems/maximum-index3307/0  

*/




class Solution {

    int maxIndexDiff(int arr[], int n) {
        int[] rightMax = new int[n];
        rightMax[n-1]= arr[n-1];
        for(int i = n-2; i>=0; i--) rightMax[i] = Math.max(rightMax[i+1] , arr[i]);
        int maxDist = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while(i < n && j < n) {
            if(rightMax[j] >= arr[i]) {
                maxDist = Math.max( maxDist, j-i );
                j++;
            }
            else // if(rightMax[j] < leftMin[i])
                i++;
        }
        return maxDist;
    }
}