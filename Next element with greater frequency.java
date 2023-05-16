/*

Problem Name : Next element with greater frequency

Link : https://practice.geeksforgeeks.org/problems/9656e96f6eaee49e67400fa2aed7833c8d9846b8/0

*/


class solver {
    static int[] print_next_greater_freq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int freq[] = new int[n];
        for(int i = 0; i < n ; i++) {
            freq[i] = map.get(arr[i]);
        }
        int nextGreaterFreqElements[] = nextLargerElement(freq, n);
        for(int i = 0; i < n ; i++) {
            if(nextGreaterFreqElements[i] != -1) {
                nextGreaterFreqElements[i] = arr[nextGreaterFreqElements[i]];
            }
        }
        return nextGreaterFreqElements;
    }
    public static int[] nextLargerElement(int[] arr, int n) { 
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            while(!s.empty() && arr[s.peek()] < arr[i]) ans[s.pop()] = i;
            s.push(i);
        }
        while(!s.empty()) ans[s.pop()] = -1;
        return ans;
    }
}