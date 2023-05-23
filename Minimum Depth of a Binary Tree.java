/*

Problem Name : Minimum Depth of a Binary Tree

Link : https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1

*/


class Solution
{
	int minDepth(Node root) {
	    return find(root, 1);
	}
	int find(Node root, int d) {
	    if(root.left == null && root.right == null) return d;
	    int ans = Integer.MAX_VALUE;
	    if(root.left != null) ans = Math.min(ans, find(root.left, d+1));
	    if(root.right != null) ans = Math.min(ans, find(root.right, d+1));
	    return ans;
	}
}
