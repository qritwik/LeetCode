class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        generateParenthesisHelper(output, "", 0, 0, n);
        return output;
    }

    public void generateParenthesisHelper(List<String> output, String ans, int open, int close, int n) {
        if (ans.length() == 2 * n) {
            output.add(ans);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(output, ans + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesisHelper(output, ans + ")", open, close + 1, n);
        }
    }
}
