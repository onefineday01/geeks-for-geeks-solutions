/*

Problem Name : Rearrange Array Alternately

Link : https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

*/


class Solution {
    public static void rearrange(long arr[], int n){
        long max = arr[n-1] + 1;
        int low = 0, high = n-1;
        
        for(int i = 0 ; i < n; i++) {
            if(i % 2 == 0) {
                arr[i] += (arr[high] % max) * max;
                high--;
            } else {
                arr[i] += (arr[low] % max) * max;
                low++;
            }
        }
        for(int i = 0; i < n ; i++) {
            arr[i] = arr[i] / max;
        }
    }
}

