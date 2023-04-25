/*

Problem Name : Serialize and Deserialize a Binary Tree

Link : https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1

*/


class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    while(q.size() > 0) {
	        int n = q.size();
	        for(int i = 0 ; i < n ; i++) {
	            Node curr = q.remove();
	            int data = -1;
	            if(curr != null)  {
	                q.add(curr.left);
	                q.add(curr.right);
	                data = curr.data;
	            }
	            A.add(data);
	        }
	    }
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        int n = A.size(), i = 0;
        if(n == 0) return null;
        Node tree = new Node(A.get(i++));
        Queue<Node> q = new LinkedList<>();
	    q.add(tree);
	    while(i < n && q.size() > 0) {
	        Node node = q.remove();
	        int leftValue = A.get(i++);
	        if(leftValue != -1) {
	            Node left = new Node(leftValue);
	            node.left = left;
	            q.add(left);
	        }
	        if(i < n) {
	            int rightValue = A.get(i++);
	            if(rightValue != -1) {
	                Node right = new Node(rightValue);
	                node.right = right;
	                q.add(right);
	            }
	        }
	    }
	    return tree;
    }
};