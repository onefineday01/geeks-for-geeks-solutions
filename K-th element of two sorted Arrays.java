/*

Problem Name : K-th element of two sorted Arrays

Link : https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/0

*/


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n < m) return kthElement(arr2, arr1, m, n, k);
        int l = Math.max(0, k-m);
        int h = Math.min(k, n);
        while(l <= h) {
            int c1 = (l + h) >> 1;
            int c2 = k - c1;
            int l1 = c1 == 0 ? Integer.MIN_VALUE : arr1[c1-1];
            int l2 = c2 == 0 ? Integer.MIN_VALUE : arr2[c2-1];
            int r1 = c1 == n ? Integer.MAX_VALUE : arr1[c1];
            int r2 = c2 == m ? Integer.MAX_VALUE : arr2[c2];
            if(l1 <= r2 && l2 <= r1) return Math.max(l1, l2);
            else if(l1 > r2) h = c1 - 1;
            else l = c1 + 1;
        }
        return 1;
    }
}

