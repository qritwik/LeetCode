class MyStack {
    
    Queue<Integer> queue;
    
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        if(queue.size() == 0) return -1;
        Queue<Integer> queue1 = new LinkedList<>();
        while(queue.size() > 1) {
            queue1.add(queue.poll());
        }
        int ans = queue.peek();
        queue = new LinkedList<>(queue1);
        return ans;
    }
    
    public int top() {
        int ans = -1;
        if(queue.size() == 0) return ans;
        Queue<Integer> queue1 = new LinkedList<>(queue);
        int i = 0;
        while(i < queue.size()) {
            ans = queue1.poll();
            i++;
        }
        return ans;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */