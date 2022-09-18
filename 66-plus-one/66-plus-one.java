class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] res = new int[n + 1];
        int k = n;
        int c = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = c;
            sum += digits[i];
            c = sum / 10;
            int d = sum % 10;
            res[k--] = d;
        }
        if (c != 0) {
            res[k--] = c;
        }
        if (res[0] == 0) {
            int[] out = new int[n];
            for (int i = 1; i <= n; i++) {
                out[i - 1] = res[i];
            }
            return out;
        } else {
            return res;
        }
    }
}
