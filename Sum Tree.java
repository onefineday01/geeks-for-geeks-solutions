/*

Problem Name : Sum Tree

Link : https://practice.geeksforgeeks.org/problems/sum-tree/0

*/


class Solution
{
	boolean ans;
    boolean isSumTree(Node root) {
        ans = true;
        helper(root);
        return ans;
    }
    int helper(Node root) {
        if(root.left == null && root.right == null) return root.data;
        int leftSum =0, rightSum =0;
        if(root.left != null)  leftSum = helper(root.left);
        if(root.right != null)  rightSum = helper(root.right);
        if(leftSum + rightSum != root.data) ans = false;
        return leftSum + rightSum + root.data;
    }
}