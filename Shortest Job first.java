/*

Problem Name : Shortest Job first

Link : https://practice.geeksforgeeks.org/problems/shortest-job-first/1

*/


class Solution {
    
    static int solve(int bt[] ) {
        Arrays.sort(bt);
        int totalTime = 0;
        int waitingTime = 0;
        for(int i : bt) {
            waitingTime += totalTime;
            totalTime += i;
        }
        return waitingTime / bt.length;
    }
}