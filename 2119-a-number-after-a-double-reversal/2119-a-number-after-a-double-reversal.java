class Solution {

    public boolean isSameAfterReversals(int num) {
        int n1 = num;
        int sum1 = 0;
        while (n1 > 0) {
            int d1 = n1 % 10;
            sum1 = sum1 * 10 + d1;
            n1 = n1 / 10;
        }

        int n2 = sum1;
        int sum2 = 0;
        while (n2 > 0) {
            int d2 = n2 % 10;
            sum2 = sum2 * 10 + d2;
            n2 = n2 / 10;
        }

        if (sum2 == num) {
            return true;
        } else {
            return false;
        }
    }
}
