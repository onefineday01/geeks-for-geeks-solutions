/*

Problem Name : K largest elements

Link : https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1

*/


class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
        for(int i : arr) {
            pq.add(i);
            if(pq.size() > k) {
                pq.remove();
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(k, 0));
        for(int i = k-1; i >= 0; i--) {
            ans.set(i, pq.remove());
        }
        return ans;
    }
}