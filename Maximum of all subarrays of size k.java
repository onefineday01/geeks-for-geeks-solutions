/*

Problem Name : Maximum of all subarrays of size k

Link : https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/0

*/


class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            while(i >= k-1 && dq.size() > 0 && dq.getFirst() + k - 1 < i) {
                dq.removeFirst();
            }
            while(dq.size() > 0 && arr[dq.getLast()] <= arr[i]  ) {
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= k - 1) {
                ans.add(arr[dq.getFirst()]);
            }
        }
        return ans;
    }
}