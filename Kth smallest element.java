/*

Problem Name : Kth smallest element

Link : https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/0

*/


class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        int n = arr.length, i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> {return b-a;});
        for(i = 0; i < n; i++ ) {
            pq.add(arr[i]);
            if(pq.size() > k) pq.remove();
        }
        return pq.remove();
    } 
}
