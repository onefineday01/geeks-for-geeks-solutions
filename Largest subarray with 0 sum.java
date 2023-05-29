/*

Problem Name : Largest subarray with 0 sum

Link : https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

*/


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        map.put(sum, -1);
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(map.containsKey(sum)) {
                ans = Math.max(i - map.get(sum), ans);
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}