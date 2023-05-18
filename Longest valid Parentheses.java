/*

Problem Name : Longest valid Parentheses

Link : https://practice.geeksforgeeks.org/problems/longest-valid-parentheses5657/1

*/


class Solution{
    static int maxLength(String s){
        int open = 0, close =0, ans = 0, n = s.length();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '(') {
                open++;
            } else {
                close++;
            }
            if(open == close && (open + close) > ans) {
                ans = open + close;
            }
            if(close > open){
                open = close = 0;
            }
        }
        open = close = 0;
        for(int i = n-1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c == '(') {
                open++;
            } else {
                close++;
            }
            if(open == close && (open + close) > ans) {
                ans = open + close;
            }
            if(close < open){
                open = close = 0;
            }
        }
        return ans;
    }
}