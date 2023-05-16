/*

Problem Name : Maximum Consecutive Ones

Link : https://practice.geeksforgeeks.org/problems/maximum-consecutive-ones/0

*/


class Solution {
    public static int longestOnes(int n, int[] nums, int k) {
        int left = 0, right = 0, zero = 0, ans = 0;
        while(right < n){
            if(nums[right] == 0) {
                zero++;
            }
            while(zero > k) {
                if(nums[left++] == 0) {
                    zero--;
                }
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}
        
