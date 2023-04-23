/*

Problem Name : Container With Most Water

Link : https://practice.geeksforgeeks.org/problems/container-with-most-water0535/0

*/


class Solve{

    long maxArea(int a[], int len){
        if (len  <= 1) return 0;
        int l = 0, r = len-1;
        long max = Long.MIN_VALUE;
        while(l < r) {
            max = Math.max((long)(Math.min(a[l], a[r]) * (long)(r-l)), max);
            if(a[l] < a[r]) l++;
            else r--;
        }
        return max;
    }
    
}