/*

Problem Name : Connect Nodes at Same Level

Link : https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/0

*/


class Solution {
    public void connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size() > 0) {
            Node curr = q.remove();
            if(curr == null) {
                if(q.size() > 0) q.add(null);
                continue;
            }
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
            curr.nextRight = q.peek();
        }
    }
}