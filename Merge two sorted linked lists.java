/*

Problem Name : Merge two sorted linked lists

Link : https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/0

*/


class LinkedList { 
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node head = dummy;
        while(head1 != null || head2 != null) {
            Node temp = null;
            if(head1 != null && head2 != null) {
                if(head1.data <= head2.data) {
                    head.next = head1; 
                    head1 = head1.next;
                } else {
                    head.next = head2;
                    head2 = head2.next;
                } 
            } else if (head1 != null) {
                head.next = head1; 
                head1 = head1.next;
            } else {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }
        return dummy.next;
   } 
}
