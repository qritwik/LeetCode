class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        double num = myPow(x, n / 2);

        if (n % 2 == 0) {
            return num * num;
        } else {
            if (n < 0) {
                return num * num / x;
            } else {
                return num * num * x;
            }
        }
    }
}