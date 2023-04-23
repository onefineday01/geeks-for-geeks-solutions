/*

Problem Name : Even Swap

Link : https://practice.geeksforgeeks.org/problems/even-swap/0

*/


class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
		int i = 0;
		while( i < n) {
		    int j = i+1;
		    while(j < n && (arr[i] + arr[j]) % 2 == 0) j++;
		    Arrays.sort(arr, i, j);
		    arr = reverse(arr, i, j);
		    i = j;
		}
		return arr;
	}
	int [] reverse(int [] arr, int i, int j) {
    	    while(i < j) {
    	        j--;
    	        int temp = arr[i];
    	        arr[i] = arr[j];
    	        arr[j] = temp;
    	        i++;
    	    }
	    return arr;
	}
}