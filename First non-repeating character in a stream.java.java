/*

Problem Name : First non-repeating character in a stream

Link : https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/0

*/


class Solution
{
    public String FirstNonRepeating(String s) {
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c-'a'] == 0) q.add(c);
            arr[c-'a'] ++;
            char fnrc = '#';
            while(q.size() > 0) {
                char temp = q.peek();
                if(arr[temp-'a'] <= 1 ) {
                    fnrc = q.peek();
                    break;
                }
                else {
                    q.remove();
                }
            }
            ans = ans + String.valueOf(fnrc);
        }
        return ans;
    }
}