class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        return func(grid, 0, 0, dp);
    }
    
    public int func(int[][] grid, int i, int j, int[][] dp) {
        if(i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(dp[i][j] != 0) return dp[i][j];
        if(i < grid.length-1) {
            down = func(grid, i+1, j, dp) + grid[i][j];
        }
        if(j < grid[0].length-1) {
            right = func(grid, i, j+1, dp) + grid[i][j];
        }
        return dp[i][j] = Math.min(down, right);
    }
}