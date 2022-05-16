class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int out[] = new int[n];
        Stack<Pair> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            int ele = temperatures[i];
            if(stack.empty()) {
                Pair p = new Pair(ele, i);
                stack.push(p);
            }
            else if(stack.peek().val >= ele) {
                Pair p = new Pair(ele, i);
                stack.push(p);
            }
            else if(stack.peek().val < ele) {
                while(!stack.empty() && stack.peek().val < ele) {
                    out[stack.peek().idx] = i - stack.peek().idx;
                    stack.pop();
                }
                Pair p = new Pair(ele, i);
                stack.push(p);
            }
        }
        return out;
    }
}

class Pair {
    int val;
    int idx;
    
    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}