class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return func(nums, 0, dp);
    }

    public int func(int[] nums, int start, int[] dp) {
        if (start >= nums.length) {
            return 0;
        }
        if (dp[start] != -1) return dp[start];
        int first = func(nums, start + 1, dp);
        int second = func(nums, start + 2, dp) + nums[start];
        return dp[start] = Math.max(first, second);
    }
}
