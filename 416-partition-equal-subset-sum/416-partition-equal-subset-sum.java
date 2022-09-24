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
            int target = sum / 2;
            int[][] dp = new int[n + 1][target + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            int check = func(nums, 0, n, target, dp);
            return check == 1 ? true : false;
        }
    }

    public int func(int[] nums, int i, int n, int target, int[][] dp) {
        if (target == 0) {
            return 1;
        }

        if (i >= n || target < 0) {
            return 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int out1 = func(nums, i + 1, n, target, dp);
        int out2 = func(nums, i + 1, n, target - nums[i], dp);

        if (out1 == 1 || out2 == 1) {
            return dp[i][target] = 1;
        } else {
            return dp[i][target] = 0;
        }
    }
}
