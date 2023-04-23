/*

Problem Name : Large Factorial

Link : https://practice.geeksforgeeks.org/problems/large-factorial4721/0

*/


class Solution {
    public long[] factorial(long a[], int n) {
        int mod = 1000000007, max = 0;
        for(long i : a) max = (int)Math.max(max, i);
        long memo[] = new long[max+1];
        memo[0] = 1;
        for(int i = 1; i <= max; i++) {
            memo[i] = (memo[i-1] % mod * i % mod) % mod;
        }
        for(int i = 0; i < n; i++) a[i] = memo[(int)a[i]];
        return a;
    }
}