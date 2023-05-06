/*

Problem Name : Flatten binary tree to linked list

Link : https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1

*/

class Solution
{
    public static void flatten(Node root)
    {
        Node current = root;
        while(current != null){
            if(current.left != null) {
                Node right = current.right;
                Node leftRight = current.left;
                while(leftRight.right != null) {
                    leftRight = leftRight.right;
                }
                leftRight.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}



