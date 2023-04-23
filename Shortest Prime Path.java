/*

Problem Name : Shortest Prime Path

Link : https://practice.geeksforgeeks.org/problems/1646a9b5169d7571cf672f2a31533af083d1f479/0

*/


class Solution
{
    int[] prime;
    Solution()
    {
        int n = 10000;
        prime = new int[n+1];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int p = 2; p * p <= n; p++) 
            if(prime[p] == 1) 
                for(int i = p * p; i <= n; i += p) 
                    prime[i] = 0;
        
    }
    
    public int shortestPath(int n1,int n2){
        boolean arr[] = new boolean[10000];
        Queue<Integer> q = new LinkedList<>();
        q.add(n1);
        q.add(null);
        int ans = 0;
        arr[n1] = true;
        while (q.size() > 0) {
            if(q.peek() == null) {
                q.remove();
                ans++;
                if(q.size() > 0) q.add(null);
                continue;
            }
            int curr = q.remove();
            if(curr == n2) return ans;
            for(int i = 10; i<= 10000;i = i * 10) {
                int pre = curr / i;
                int suff = curr % (i/10);
                for(int j = 0; j < 10; j++) {
                    if(i == 10000 && j == 0) continue;
                    int newnum = pre*(i) + j*(i/10) + suff;
                    if(prime[newnum] == 1 && !arr[newnum]) q.add(newnum);
                    arr[newnum] = true;
                }
            }
        }
        return -1;
    }
}