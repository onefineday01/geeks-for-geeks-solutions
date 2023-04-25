/*

Problem Name : Reverse a Linked List in groups of given size

Link : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

*/


class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node head = new Node(-1);
        Node dummy = head;
        Node reverse = null;
        int i = 0;
        while(node != null) {
            if(reverse == null) {
                reverse = node;
            }
            i++;
            if(i == k || node.next == null) {
                Node nextNew = node.next;
                node.next = null;
                dummy.next = reverseLinkedList(reverse);
                reverse = null;
                while(dummy.next != null) {
                    dummy = dummy.next;
                }
                node = nextNew;
                i = 0;
            } else {
                node = node.next;
            }
        }
        return head.next;
    }
    public static Node reverseLinkedList(Node node) {
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

