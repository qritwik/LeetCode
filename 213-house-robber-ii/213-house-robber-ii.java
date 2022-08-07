class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return Math.max(func(nums, 0, nums.length-2, dp), func(nums, 1, nums.length-1, dp));
    }
    
    public int func(int[] nums, int low, int high, int[][] dp) {
        if(low > high) return 0;
        if(dp[low][high] != -1) return dp[low][high];
        int first = func(nums, low+1, high, dp);
        int second = func(nums, low+2, high, dp) + nums[low];
        return dp[low][high] = Math.max(first, second);
    }
}