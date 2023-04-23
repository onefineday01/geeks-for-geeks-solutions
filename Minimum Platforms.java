/*

Problem Name : Minimum Platforms

Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/0

*/


class Solution {
    static int findPlatform(int arr[], int dep[], int n) {
        int a = 0, d = 0, count = 0, max = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(a < n && d < n) {
            if(arr[a] <= dep[d]) {
                count++;
                a++;
            } else {
                count--;
                d++;
            }
            max = Math.max(count, max);
        }
        count += n-a;
        return Math.max(max, count);
    }
    
}

