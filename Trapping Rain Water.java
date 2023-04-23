/*

Problem Name : Trapping Rain Water

Link : https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/0

*/



class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int left[] = new int[n];
        int right[] = new int[n];
        left[0]= arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1; i < n; i++)
            left[i] = Math.max(left[i-1], arr[i]);
        for(int i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1], arr[i]);
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i] - Math.min(left[i], right[i]);
        }
        return -1*sum;
    } 
}
