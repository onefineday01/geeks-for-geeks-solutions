/*

Problem Name : Largest Fibonacci Subsequence

Link : https://practice.geeksforgeeks.org/problems/largest-fibonacci-subsequence2206/1

*/


class Solution {
    public int[] findFibSubset(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            max = Math.max(max, i);
        }
        int a = 0, b =1;
        set.add(a);
        while(a <= max) {
            int fib = a+b;
            a = b;
            b = fib;
            set.add(a);
            set.add(b);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(set.contains(i)) {
                list.add(i);
            }
        }
        int ans[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}