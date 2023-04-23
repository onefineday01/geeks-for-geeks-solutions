/*

Problem Name : Nearly sorted

Link : https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/0

*/


class Solution {
    ArrayList <Integer> nearlySorted(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < 2*k+1 && i < n; i++) pq.add(arr[i]);
        int heapIndex = 2*k+1;
        for(int i = 0 ; i < n ; i++) {
            ans.add(pq.remove());
            if(heapIndex < n) pq.add(arr[heapIndex++]);
        }
        return ans;
    }
}
