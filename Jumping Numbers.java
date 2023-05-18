/*

Problem Name : Jumping Numbers

Link : https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1

*/


class Solution {
    static long jumpingNums(long num) {
        Queue<Long> q = new LinkedList<>();
        HashSet<Long> set = new HashSet<>();
        Long ans = 0L;
        for(long i  = 1; i < 10; i++) {
            if(i > num) {
                return ans;
            }
            if(i == num) {
                return num;
            }
            ans = Math.max(ans, i);
            q.add(i);
            set.add(i);
        }
        boolean flag = true;
        while(q.size() > 0) {
            int qSize = q.size();
            while(qSize-- > 0) {
                long curr = q.remove();
                long mod = curr % 10;
                if(mod != 0) {
                    long newNum = curr * 10 + mod - 1;
                    if(newNum <= num && set.add(newNum)){
                        ans = Math.max(ans, newNum);
                        q.add(newNum);
                    }
                }
                if(mod != 9) {
                    long newNum = curr * 10 + mod + 1;
                    if(newNum <= num && set.add(newNum)){
                        ans = Math.max(ans, newNum);
                        q.add(newNum);
                    }
                }
            }
        }
        return ans;
    }
}