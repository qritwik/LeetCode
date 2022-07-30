class MinStack {
    int min;
    Stack<Pair> stack;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
    }

    public void push(int val) {
        min = Math.min(min, val);
        Pair p = new Pair(val, min);
        stack.push(p);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
        if (!stack.isEmpty()) {
            min = stack.peek().min;
        } else {
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return this.min;
    }
}

class Pair {
    int val;
    int min;

    public Pair(int val, int min) {
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
