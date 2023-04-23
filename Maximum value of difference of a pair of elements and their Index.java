/*

Problem Name : Maximum value of difference of a pair of elements and their Index

Link : https://practice.geeksforgeeks.org/problems/maximum-value-of-difference-of-a-pair-of-elements-and-their-index/0

*/


class Solution {
    static int maxValue(int[] arr, int N) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            max1 = Math.max(max1, arr[i] + i);
            min1 = Math.min(min1, arr[i] + i);
            max2 = Math.max(max2, arr[i] - i);
            min2 = Math.min(min2, arr[i] - i);
        }
        return Math.max(max1 - min1, max2 - min2);
    }
};