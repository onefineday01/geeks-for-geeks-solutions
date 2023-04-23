/*

Problem Name : Longest consecutive subsequence

Link : https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/0

*/


class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    HashSet<Integer> set = new HashSet<>();
	    for(int i : arr) set.add(i);
	    int ans = Integer.MIN_VALUE;
	    for(int i : arr) if (!set.contains(i - 1)){
            int j = i;
            while (set.contains(j)) j++;
            if (ans < j - i) ans = j - i;
        }
        return ans;
	}
}