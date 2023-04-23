/*

Problem Name : Jump Game

Link : https://practice.geeksforgeeks.org/problems/jump-game/0

*/


class Solution {
    static int canReach(int[] A, int N) {
        int r = 0;
        for(int i = 0; i < N; i++) {
            if(i > r) {
                return 0;
            }
            r = Math.max(r, A[i]+i);
        }
        return 1;
    }
}