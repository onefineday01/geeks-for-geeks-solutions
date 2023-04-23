/*

Problem Name : Rotten Oranges

Link : https://practice.geeksforgeeks.org/problems/rotten-oranges2536/0

*/



class cell {
    int x = 0, y = 0;
    cell (int a, int b) {
        x = a;
        y = b;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {   
        Queue<cell> q = new LinkedList<>();
        int n = grid.length, m = grid[0].length;
        q.add(null);
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < m; j++) { 
                if(grid[i][j] == 2)  {
                    if(i + 1 < n && grid[i + 1][j] == 1) q.add(new cell(i + 1, j));
                    if(i - 1 >= 0 && grid[i - 1][j] == 1) q.add(new cell(i - 1, j));
                    if(j + 1 < m && grid[i][j + 1] == 1) q.add(new cell(i, j + 1));
                    if(j - 1 >= 0 && grid[i][j - 1] == 1) q.add(new cell(i, j - 1));
                }
            }
        }
        int time  = 0, changed  = 0;
        while(q.size() > 0) {
            cell rot = q.remove();
            if(rot == null) {
                if(changed > 0) time++;
                changed = 0;
                if(q.size() == 0) break;
                q.add(null);
                continue;
            }
            if(grid[rot.x][rot.y] == 1) {
                grid[rot.x][rot.y] = 2;
                changed++;
                if(rot.x + 1 < n && grid[rot.x + 1][rot.y] == 1) q.add(new cell(rot.x + 1, rot.y));
                if(rot.x - 1 >= 0 && grid[rot.x - 1][rot.y] == 1) q.add(new cell(rot.x - 1, rot.y));
                if(rot.y + 1 < m && grid[rot.x][rot.y + 1] == 1) q.add(new cell(rot.x, rot.y + 1));
                if(rot.y - 1 >= 0 && grid[rot.x][rot.y - 1] == 1) q.add(new cell(rot.x, rot.y - 1));
            }
        }
        for(int i = 0; i < n; i++) for(int j = 0 ; j < m; j++) if(grid[i][j] == 1) return -1;
        return time;
    }
}