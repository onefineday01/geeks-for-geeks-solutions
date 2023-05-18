/*

Problem Name : Find triplets with zero sum

Link : https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1

*/


class Solution {
	public boolean findTriplets(int arr[] , int n) {
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i ++) {
            int l = i+1, h = n-1;
            int required = arr[i] * -1;
            while(l < h) {
                int current = arr[l] + arr[h];
                if(current > required) {
                    h--;
                } else if(current < required) {
                    l++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}