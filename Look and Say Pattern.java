/*

Problem Name : Look and Say Pattern

Link : https://practice.geeksforgeeks.org/problems/decode-the-pattern1138/1

*/


class Solution{
    static String lookandsay(int n) {
        String ans = "1";
        for(int j = 1; j < n; j++) {
            String temp = "";
            char curr = ans.charAt(0);
            int freq = 1;
            for(int i = 1; i < ans.length(); i++) {
                if(ans.charAt(i) == curr) {
                    freq++;
                } else {
                    temp = temp + Integer.toString(freq) + curr;
                    curr = ans.charAt(i);
                    freq = 1;
                }
            }
            temp = temp + Integer.toString(freq) + curr;
            ans = temp;
        }
        return ans;
    }
}