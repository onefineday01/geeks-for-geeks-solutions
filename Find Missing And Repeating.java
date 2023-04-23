/*

Problem Name : Find Missing And Repeating

Link : https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/0

*/


class Solve {
    int[] findTwoElement(int arr[], int n) {
        for(int i = 0; i < n; i++) arr[Math.abs(arr[i]) - 1] *= -1;
        int[] ans = new int[2];
        for(int i = 0, j = 0; i < n && j < 2; i++) if(arr[i] > 0) ans[j++] = i+1;
        int repeating = 0;
        for(int i : arr) if(Math.abs(i) == ans[0]) repeating++;
        if(repeating > 0) return ans;
        repeating = ans[0];
        ans[0] = ans[1];
        ans[1] = repeating;
        return ans;
    }
}