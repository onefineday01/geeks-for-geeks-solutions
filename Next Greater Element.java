/*

Problem Name : Next Greater Element

Link : https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/0

*/


class Solution {
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Integer> s = new Stack<>();
        long ans[] = new long[n];
        for(int i = 0 ; i < n ; i++) {
            while(!s.empty() && arr[s.peek()] < arr[i]) ans[s.pop()] = arr[i];
            s.push(i);
        }
        while(!s.empty()) ans[s.pop()] = -1L;
        return ans;
    } 
}