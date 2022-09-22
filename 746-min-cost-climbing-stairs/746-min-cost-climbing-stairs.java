class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        return Math.min(func(cost, 0, dp), func(cost, 1, dp));
    }

    public int func(int[] cost, int start, int[] dp) {
        if (start >= cost.length) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int out1 = cost[start] + func(cost, start + 1, dp);
        int out2 = cost[start] + func(cost, start + 2, dp);
        return dp[start] = Math.min(out1, out2);
    }
}
