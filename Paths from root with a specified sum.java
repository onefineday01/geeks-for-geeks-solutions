/*

Problem Name : Paths from root with a specified sum

Link : https://practice.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/0

*/


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root != null) {
            ArrayList<Integer> temp = new ArrayList<>();
            helperDFS(root, 0, sum, temp, result);
        }
        return result;
    }
    static void helperDFS(Node root, int currSum, int sum, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result) {
        temp.add(root.data);
        currSum += root.data;
        if(currSum >= sum) {
            if(currSum == sum) {
                copyAndAdd(temp, result);
            }
            temp.remove(temp.size() - 1);
            currSum -= root.data;
            return;
        }
        Node left = root.left;
        Node right = root.right;
        if(left != null) {
            helperDFS(left, currSum, sum, temp, result);
        }
        if(right != null) {
            helperDFS(right, currSum, sum, temp, result);
        }
        temp.remove(temp.size() - 1);
        currSum -= root.data;
        return;
    }
    static void copyAndAdd(ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> ans = new ArrayList<>(temp);
        result.add(ans);
        return;
    }
}