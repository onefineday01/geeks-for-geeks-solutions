/*

Problem Name : Largest Number formed from an Array

Link : https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

*/


class LargerNumberComparator implements Comparator<String> {
    public int compare(String a, String b) {
        String s1 = a + b;
        String s2 = b + a;
        return s2.compareTo(s1);
    }
}
class Solution {
    String printLargest(String[] arr) {
        Arrays.sort(arr, new LargerNumberComparator());
        String ans = "";
        for(String s : arr) {
            ans = ans + s;
        }
        return ans;
    }
}