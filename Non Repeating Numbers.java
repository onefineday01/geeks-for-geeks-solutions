/*

Problem Name : Non Repeating Numbers

Link : https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1

*/


class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int arr[] = new int[2];
        for(int i : nums) {
            xor ^= i;
        }
        xor = xor & ~(xor-1);
        for(int i : nums) {
            if((xor & i) == 0) {
                arr[0] ^= i;
            } else {
                arr[1] ^= i;
            }
        }
        if(arr[0] > arr[1]) {
            int temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        return arr;
    }
}
