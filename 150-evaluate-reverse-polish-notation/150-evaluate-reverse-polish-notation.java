class Solution {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                int result = 0;
                if (str.equals("+")) result = a + b;
                if (str.equals("-")) result = a - b;
                if (str.equals("*")) result = a * b;
                if (str.equals("/")) result = a / b;
                stack.push(String.valueOf(result));
            } else {
                stack.push(str);
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
