class MinStack {
    
    Stack<Pair> stack;
    int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val <= min) {
            min = val;
        }
        Pair p = new Pair(val, min);
        stack.push(p);
    }
    
    public void pop() {
        if(!stack.empty()) {
            stack.pop();
            if(!stack.empty()) {
                min = stack.peek().min;
            }
        }
        if(stack.empty()) min = Integer.MAX_VALUE;
    }
    
    public int top() {
        if(!stack.empty()) {
            return stack.peek().val;
        }
        return -1;
    }
    
    public int getMin() {
        if(!stack.empty()) {
            return stack.peek().min;
        }
        return -1;
    }
}

class Pair {
    int val;
    int min;
    Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */