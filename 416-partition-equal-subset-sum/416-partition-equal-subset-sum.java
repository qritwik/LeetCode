class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // odd sum
        if (sum % 2 != 0) {
            return false;
        }
        // even sum
        else {
            int W = sum / 2;
            boolean[][] dp = new boolean[n + 1][W + 1];

            // Initialisation
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < W + 1; j++) {
                    if (i == 0) {
                        dp[i][j] = false;
                    }
                    if (j == 0) {
                        dp[i][j] = true;
                    }
                }
            }

            // Tabulation
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < W + 1; j++) {
                    if (nums[i - 1] <= j) {
                        dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[n][W];
        }
    }
}
