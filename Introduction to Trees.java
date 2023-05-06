/*

Problem Name : Introduction to Trees

Link : https://practice.geeksforgeeks.org/problems/introduction-to-trees/1

*/


class Solution {
    static int countNodes(int i) {
        return (int) Math.pow(2, i-1);
    }
}