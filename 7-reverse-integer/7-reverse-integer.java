class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0 ? true : false;
        int num = Math.abs(x);
        long sum = 0;
        while(num > 0) {
            int d = num % 10;
            sum = sum * 10 + d;
            num = num / 10;
            if(sum < -2147483648 && sum > 2147483647) {
                return 0;
            }
        }
        if(isNegative) {
            sum = sum * -1;
        }
        if(sum >= -2147483648 && sum <= 2147483647) {
            return (int)sum;
        }
        return 0;
    }
}