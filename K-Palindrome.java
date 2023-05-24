/*

Problem Name : K-Palindrome

Link : https://practice.geeksforgeeks.org/problems/k-palindrome/1

*/


class GfG {
    boolean is_k_palin(String str, int k) {
        return ((str.length() - k) <= lcs(str, new StringBuilder(str).reverse().toString()));
    }
    
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int dp[][] = new int[n+1][n+1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[n][n];
    }
}