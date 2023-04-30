/*

Problem Name : Maximum number of events that can be attended

Link : https://practice.geeksforgeeks.org/problems/ea8230731ccb057120bafb351c10c48b2d496125/1

*/


class Event {
    int start, end;
    Event(int s, int e) {
        start = s;
        end = e;
    }
}
class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        
        PriorityQueue<Event> pq = new PriorityQueue<Event>((a,b) -> {
            if(a.end == b.end) {
                return a.start - b.start;
            }
            return a.end - b.end;
        });
        
        for(int i = 0; i < N; i++) {
            pq.add(new Event(start[i], end[i]));
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=1;i<=100000;i++) {
            set.add(i);
        }
        
        int count = 0;
        while(pq.size() > 0) {
            Event event = pq.remove();
            int s = event.start;
            int e = event.end;
            int value = set.ceiling(s);
            if(value <= e) {
                count++;
                set.remove(value);
            }
        }
        return count;
    }
}