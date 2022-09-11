class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 == 0) {
            long q = num / 3;
            return new long[]{q-1, q, q+1};
        }
        return new long[0];
    }
}