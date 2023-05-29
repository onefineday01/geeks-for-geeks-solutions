/*

Problem Name : https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/0

Link : Triplet Sum in Array

*/


class Solution {
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for(int i = 0; i < n - 2; i++) {
            int l = i+1, h = n-1, req = X-A[i];
            while(l < h) {
                int sum = A[l]+A[h];
                if(sum > req) {
                    h--;
                } else if(req > sum) {
                    l++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
