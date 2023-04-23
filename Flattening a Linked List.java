/*

Problem Name : Flattening a Linked List

Link : https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/0

*/


class GfG {
    Node flatten(Node root) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data-b.data);
        while(root != null) {
            Node next = root.next;
            root.next = null;
            pq.add(root);
            root = next;
        }
        Node ans = new Node(-1);
        Node head = ans;
        while(pq.size() > 0) { 
            Node curr = pq.remove();
            Node next = curr.bottom;
            curr.bottom = null;
            if(next != null) pq.add(next);
            head.bottom = curr;
            head = head.bottom;
        }
        return ans.bottom;
    }
}