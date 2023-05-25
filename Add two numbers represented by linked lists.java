/*

Problem Name : Add two numbers represented by linked lists

Link : https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

*/


class Solution {
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node f, Node s){
        f = reverseLL(f);
        s = reverseLL(s);
        Node dummy = new Node(-1);
        Node head = dummy;
        int carry = 0;
        while(f != null || s != null) {
            int sum = carry;
            if(f != null) {
                sum += f.data;
                f = f.next;
            }
            if(s != null) {
                sum += s.data;
                s = s.next;
            }
            carry = sum /10;
            sum = sum % 10;
            head.next = new Node(sum);
            head = head.next;
        }
        if(carry > 0) {
            head.next = new Node(carry);
            head = head.next;
        }
        return reverseLL(dummy.next);
    }
    
    public static Node reverseLL(Node node) {
        Node prev = null;
        Node next = null;
        while(node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
    
}