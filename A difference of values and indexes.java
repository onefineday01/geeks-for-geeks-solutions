/*

Problem Name : A difference of values and indexes

Link : https://practice.geeksforgeeks.org/problems/a-difference-of-values-and-indexes0302/0

*/



class Solution {
    public static int maxDistance (int arr[], int n) {
        int max = Integer.MIN_VALUE, ans = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] - i);
            min = Math.min(min, arr[i] + i);
            ans = Math.max(ans, Math.max((arr[i] + i - min), (max - arr[i] + i)));
        }
        return ans;
    }
}
