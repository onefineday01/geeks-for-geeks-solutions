/*

Problem Name : Find a pair with given target in BST

Link : https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/0

*/


class Solution {
    HashSet<Integer> set;
    public int isPairPresent(Node root, int target) {
        set = new HashSet<>();
        return helper(root, target);
    }
    int helper(Node root, int k) {
        int left = 0, right = 0;
        if(set.contains(k - root.data)) return 1;
        set.add(root.data);
        if(root.left != null) left = helper(root.left, k);
        if(root.right != null) right = helper(root.right, k);
        return left | right;
    }
}
