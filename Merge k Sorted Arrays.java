/*

Problem Name : Merge k Sorted Arrays

Link : https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/0

*/



class pair {
    int data, array, index;
    pair(int d, int i, int a) {
        data = d;
        index = i;
        array = a;
    }
}

class Solution {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
            return a.data - b.data;
        });
        for(int i = 0; i < k; i++) pq.add(new pair(arr[i][0], 0, i));
        while(pq.size() > 0) {
            pair curr = pq.remove();
            ans.add(curr.data);
            if(curr.index < k-1) {
                pq.add(new pair(arr[curr.array][curr.index + 1], curr.index + 1, curr.array));
            }
        }
        return ans;
    }
}