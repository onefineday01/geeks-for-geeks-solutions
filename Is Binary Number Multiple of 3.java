/*

Problem Name : Is Binary Number Multiple of 3

Link : https://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1

*/


class Solution {
    int isDivisible(String s) {
        int diff = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                if((i & 1) == 1)  {
                    diff++;
                } else {
                    diff--;
                }
            }
        }
        return ((Math.abs(diff) % 3) == 0 ? 1 : 0);
    }
}