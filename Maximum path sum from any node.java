/*

Problem Name : Maximum path sum from any node

Link : https://practice.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/0

*/


class Solution {
    int max;
    int findMaxSum(Node node) {
        max=Integer.MIN_VALUE;
        haspath(node);
        return max;
    }
    int haspath(Node root){
        if(root == null) return 0;
        int left =  Math.max(0,haspath(root.left));
        int right = Math.max(0,haspath(root.right));
        max = Math.max(max, root.data + left + right);
        return Math.max(left, right) + root.data;
    }
}
