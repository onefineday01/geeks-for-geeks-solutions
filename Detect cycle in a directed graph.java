/*

Problem Name : Detect cycle in a directed graph

Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/0

*/


class Solution {
    // Function to detect cycle in a directed graph.
    boolean vis[], vis2[];
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        vis = new boolean[V];
        vis2 = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!vis[i] && checkVisited(i, adj)) {
                return true;
            }
        }
        return false;
    }
    boolean checkVisited(int index, ArrayList<ArrayList<Integer>> list){
        vis[index] = true;
        vis2[index] = true;
        ArrayList<Integer> ar = list.get(index);
        for(int i : ar) { 
            if((!vis[i] && checkVisited(i, list)) || vis2[i]) {
                return true;
            }
        }
        vis2[index] = false;
        return false;
    }
}