class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(stack.empty() || stack.peek().key != ch) {
                Pair p = new Pair(ch, 1);
                stack.push(p);
            }
            else {
                Pair p = stack.pop();
                Pair newPair = new Pair(p.key, p.value+1);
                if(newPair.value < k) {
                    stack.push(newPair);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(Pair p : stack) {
            sb.append(String.valueOf(p.key).repeat(p.value));
        }
        return sb.toString();
    }
}

class Pair {
    char key;
    int value;
    
    Pair(char k, int v) {
        this.key = k;
        this.value = v;
    }
}