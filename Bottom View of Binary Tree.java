/*

Problem Name : Bottom View of Binary Tree

Link : https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/0

*/




//User function Template for Java


class Solution {
    public ArrayList <Integer> bottomView(Node root) {
        Queue<Node> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        root.hd = 0;
        q.add(root);
        while(q.size() > 0) {
            Node node = q.remove();
            if(node.left != null) {
                node.left.hd = node.hd - 1;
                q.add(node.left);
            }
            if(node.right != null) {
                node.right.hd = node.hd + 1;
                q.add(node.right);
            }
            map.put(node.hd, node.data);
        }
        for(int i : map.keySet() ) ans.add(map.get(i));
        return ans;
    }
}