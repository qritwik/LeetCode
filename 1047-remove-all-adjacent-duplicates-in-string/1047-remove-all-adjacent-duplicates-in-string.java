class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(stack.empty() || stack.peek() != ch) {
                stack.push(ch);
            }
            else {
                stack.pop();
            }
        }
        String res = "";
        while(!stack.empty()) {
            res = stack.pop() + res;
        }
        return res;
    }
}