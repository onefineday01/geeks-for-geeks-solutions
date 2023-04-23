/*

Problem Name : Vertical Traversal of Binary Tree

Link : https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/0

*/


class pair{
    int col;
    Node nod;
    pair(int i, Node n) {
        col = i;
        nod = n;
    }
}

class Solution {
    static ArrayList <Integer> verticalOrder(Node root) {
        Queue<pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(new pair(0, root));
        while(q.size() > 0) {
            pair p = q.remove();
            Node node = p.nod;
            int colIndex = p.col;
            if(node.left != null) q.add(new pair(colIndex - 1, node.left));
            if(node.right != null) q.add(new pair(colIndex + 1, node.right));
            if(!map.containsKey(colIndex)) {
                map.put(colIndex, new ArrayList<Integer>());
            }
            map.get(colIndex).add(node.data);
        }
        for(int i : map.keySet() ) for(int j : map.get(i)) ans.add(j);
        return ans;
    }
}