/*

Problem Name : https://practice.geeksforgeeks.org/problems/2d3fc3651507fc0c6bd1fa43861e0d1c43d4b8a1/0

Link : Maximum Possible Value

*/


class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        long ans= 0L;
        int small = Integer.MAX_VALUE, count = 0;
        for(int i = 0; i < N; i++) {
            if(B[i] / 2 > 0) {
                ans += A[i] * (B[i] / 2) * 2;
                count += (B[i] / 2) * 2;
                small = Math.min(A[i], small);
            }
        }
        if(count % 4 != 0) {
            ans -= small*2;
        }
        return ans;
    }
} 