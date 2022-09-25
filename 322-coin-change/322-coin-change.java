class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int sum = amount;
        int[][] dp = new int[n+1][sum+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int val = func(coins, 0, sum, n, dp);
        val = val == Integer.MAX_VALUE-1 ? -1 : val;
        return val;
    }
    
    public int func(int[] coins, int i, int sum, int n, int[][] dp) {

        if(sum == 0) {
            return 0;
        }

        if(i == n || sum < 0) {
            return Integer.MAX_VALUE-1;
        }
        
        if(dp[i][sum] != -1) {
            return dp[i][sum];
        }

        int out1 = 1 + func(coins, i, sum - coins[i], n, dp);
        int out2 = func(coins, i + 1, sum, n, dp);

        return dp[i][sum] = Math.min(out1, out2);
    }
}