/*

Problem Name : Subarray with given sum

Link : https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

*/


class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int i = 0, j = 0, sum = arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        while(j <= n) {
            if(sum != 0 && sum == s && i <= j) {
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            if(sum < s) {
                j++;
                if(j < n) {
                    sum += arr[j];
                    if(sum != 0 && sum == s && i <= j) {
                        ans.add(i+1);
                        ans.add(j+1);
                        return ans;
                    }
                }
            } else if(sum > s) {
                sum -= arr[i];
                i++;
                if(sum != 0 &&sum == s  && i <= j) {
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
            }
            if(sum == 0) {
                j++;
                if(j < n) {
                    sum += arr[j];
                    if(sum != 0 && sum == s && i <= j) {
                        ans.add(i+1);
                        ans.add(j+1);
                        return ans;
                    }
                }
            }
        }
        ans.add(-1);
        return ans;
    }
    
}