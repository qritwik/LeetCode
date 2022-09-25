class Solution {

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(coins, 0, amount, n, dp);
    }

    public int func(int[] coins, int i, int amount, int n, int[][] dp) {
        if (amount == 0) {
            return 1;
        }

        if (i == n || amount < 0) {
            return 0;
        }

        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int out1 = func(coins, i, amount - coins[i], n, dp);
        int out2 = func(coins, i + 1, amount, n, dp);

        return dp[i][amount] = out1 + out2;
    }
}
