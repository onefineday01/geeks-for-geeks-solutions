/*

Problem Name : Check if Linked List is Palindrome

Link : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

*/


class Solution
{
    boolean isPalindrome(Node head) {
        Node temp = head;
        int count = 0;
        while(temp!= null) {
            count++;
            temp = temp.next;
        }
        if(count == 1) {
            return true;
        }
        boolean odd = (count % 2 == 1);
        count = count/2;
        temp = head;
        while(count-- > 1) {
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = null;
        if(odd) {
            temp2 = temp2.next; 
        }
        head = reverseLinkedList(head);
        while(head != null && temp2 != null) {
            if(head.data != temp2.data){
                return false;
            }
            head = head.next;
            temp2 = temp2.next;
        }
        
        return true;
    }
    Node reverseLinkedList(Node node) {
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