/*

Problem Name : Gray Code

Link : https://practice.geeksforgeeks.org/problems/gray-code-1611215248/1

*/


class Solution
{
    public ArrayList<String> graycode(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if(n==1)  {
            ans.add("0");
            ans.add("1");
            return ans;
        }
        ArrayList<String> res = graycode(n-1);
        
        for(int i = 0; i < res.size(); i++) {
            ans.add("0" + res.get(i));
        }
        for(int i = res.size()-1; i >= 0; i--) {
            ans.add("1" + res.get(i));
        }
        return ans;
    }
}