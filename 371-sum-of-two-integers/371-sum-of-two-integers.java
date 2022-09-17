class Solution {
    public int getSum(int a, int b) {
        String binaryStrA = Integer.toBinaryString(a);
        String binaryStrB = Integer.toBinaryString(b);
        char[] ca = binaryStrA.toCharArray();
        char[] cb = binaryStrB.toCharArray();
        int i = ca.length - 1;
        int j = cb.length - 1;
        String res = "";
        int c = 0;
        while (i >= 0 || j >= 0) {
            int sum = c;
            if (i >= 0 && ca[i] == '1') {
                sum += 1;
            }
            if (j >= 0 && cb[j] == '1') {
                sum += 1;
            }
            if (sum == 1) {
                res = "1" + res;
                c = 0;
            } else if (sum == 2) {
                res = "0" + res;
                c = 1;
            } else if (sum == 0) {
                res = "0" + res;
                c = 0;
            } else {
                res = "1" + res;
                c = 1;
            }
            i--;
            j--;
        }
        res = String.valueOf(c) + res;
        int out = (int) Long.parseUnsignedLong(res, 2);
        return out;
    }
}
