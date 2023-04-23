/*

Problem Name : Generate Parentheses

Link : https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/0

*/


class Solution {
    public List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("", n , n, ans);
        return ans;
    }
    void helper(String s, int o, int c, List<String> ans){
        if(o == 0 && c == 0) {
            ans.add(s);
            return;
        }
        if(o != 0) helper(s+"(", o-1, c, ans);
        if(c > o) helper(s+")", o, c-1, ans);
    }
}