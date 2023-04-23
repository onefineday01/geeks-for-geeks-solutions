/*

Problem Name : Stock span problem

Link : https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/0

*/


class Solution {
    public static int[] calculateSpan(int price[], int n) {
        int ans [] = new int[n];
        Stack<Integer> stack =  new Stack<>();
        for(int i = 0; i < n; i++) {
            int index = 0;
            while(stack.size() > 0 && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            if(stack.size() == 0) ans[i] = i + 1;
            else ans[i] = i - stack.peek();
            stack.push(i);
        }
        return ans;
    }
}