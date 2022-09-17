class Solution {

    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            out[i] = getCount(i);
        }
        return out;
    }

    public int getCount(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            int rem = num % 2;
            if (rem == 1) count++;
            num = num / 2;
        }
        return count;
    }
}
