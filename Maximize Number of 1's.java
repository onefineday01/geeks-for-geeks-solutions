/*

Problem Name : Maximize Number of 1's

Link : https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/0

*/


class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        int ans = 0, zeros = 0, start = 0;
        for(int end = 0; end < n; end++) {
            if(arr[end] == 0) zeros++;
            while(zeros > m) {
                if(arr[start] == 0) zeros--;
                start++;
            }
            ans = Math.max(ans, end-start+1);
        }
        return ans;
    }
}