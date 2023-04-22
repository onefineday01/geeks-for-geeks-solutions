/*

Problem Name : N meetings in one room

Link : https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

*/
class Meeting {
    int s, e;
    Meeting(int a, int b) {
        s = a;
        e = b;
    }
}
class Solution {
    public static int maxMeetings(int start[], int end[], int n) {
        PriorityQueue<Meeting> pq = new PriorityQueue<>((a,b) -> a.e  - b.e);
        for(int i = 0; i < n ; i++) pq.add(new Meeting(start[i], end[i]));
        Meeting previousMeeting = pq.remove();
        int meets = 1;
        while(pq.size() > 0) {
            Meeting currMeeting = pq.remove();
            if(currMeeting.s > previousMeeting.e) {
                meets++;
                previousMeeting = currMeeting;
            }
        }
        return meets;
    }
}
