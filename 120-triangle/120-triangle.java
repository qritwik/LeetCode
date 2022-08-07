class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return func(triangle, 0, 0, triangle.size(), dp);
    }

    public int func(List<List<Integer>> triangle, int row, int col, int n, int[][] dp) {
        if (row == n - 1) {
            return triangle.get(row).get(col);
        }
        if (dp[row][col] != Integer.MAX_VALUE) return dp[row][col];
        int first = func(triangle, row + 1, col, n, dp);
        int second = func(triangle, row + 1, col + 1, n, dp);
        return dp[row][col] = Math.min(first, second) + triangle.get(row).get(col);
    }
}

