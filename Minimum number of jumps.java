/*

Problem Name : Minimum number of jumps

Link : https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/0

*/


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int farthest = 0, end = 0, jumps = 0, n = arr.length;
        for(int i = 0; i < n; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if(i == end) {
                jumps++;
                end = farthest;
                if(farthest >= n-1) {
                    return jumps;
                }
            }
        }
        return -1;
    }
}