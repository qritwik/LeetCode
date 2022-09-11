class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max_sum = Math.max(max_sum, sum);
            if (sum < 0) sum = 0;
        }
        return max_sum;
    }
}
