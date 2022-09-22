class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return Math.max(func(nums, 0, n-2, dp), func(nums, 1, n-1, dp));
    }
    
    public int func(int[] nums, int low, int high, int[][] dp) {
        if(low > high) {
            return 0;
        }
        
        if(dp[low][high] != -1) {
            return dp[low][high];
        }
        
        int out1 = func(nums, low + 1, high, dp);
        int out2 = nums[low] + func(nums, low + 2, high, dp);
        return dp[low][high] = Math.max(out1, out2);
    }
}
