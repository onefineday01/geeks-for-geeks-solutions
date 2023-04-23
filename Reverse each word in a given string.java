/*

Problem Name : Reverse each word in a given string

Link : https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1

*/


class Solution {
    String reverseWords(String S) {
        String w = "", ans = "";
        for(char c : S.toCharArray()) {
            if(c == '.') {
                ans = ans + w + ".";
                w = "";
            } else {
                w = c + w;
            }
        }
        ans = ans + w;
        return ans;
    }
}