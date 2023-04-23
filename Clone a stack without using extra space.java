/*

Problem Name : Clone a stack without using extra space

Link : https://practice.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/0

*/


class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        if(st.empty()) return;
        int a = st.pop();
        clonestack(st, cloned);
        cloned.push(a);
    }
}