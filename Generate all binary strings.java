/*

Problem Name : Generate all binary strings

Link : https://practice.geeksforgeeks.org/problems/generate-all-binary-strings/0

*/


class Solution {
    public static List<String> generateBinaryStrings(int n) {
        List<String> ans = new ArrayList<String>();
        ans.add("0");
        ans.add("1");
        while(--n > 0) {
            int len = ans.size();
            for(int i = 0; i < len ; i++) {
                String s = ans.get(0);
                ans.add(s+ "0");
                if(s.charAt(s.length() -1 ) != '1') {
                    ans.add(s + "1");
                }
                ans.remove(0);
            }
        }
        return ans;
    }
}