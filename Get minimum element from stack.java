/*

Problem Name : Get minimum element from stack

Link : https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/0

*/




class GfG {
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG() {
        s = new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin() {
        if(s.size() == 0) {
            return -1;
        }
        return s.peek() % 10000;
    }
    
    /*returns poped element from stack*/
    int pop() {
        if(s.size() == 0) {
            return -1;
        }
        int popElement = s.pop();
        return popElement / 10000;
    }

    /*push element x into the stack*/
    void push(int x) {
        if(s.size() == 0) {
            s.push(x * 10000 + x);
            return;
        }
        int top = s.peek();
        s.push(x * 10000 + Math.min(x, s.peek() % 10000));
    }
}