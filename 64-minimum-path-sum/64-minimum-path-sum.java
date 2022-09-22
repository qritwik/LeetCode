class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min_sum = 0;
        min_sum = func(grid, 0, m-1, 0, n-1, dp);
        return min_sum;
    }
    
    public int func(int[][] grid, int is, int ie, int js, int je, int[][] dp) {
        
        if(is == ie && js == je) {
            return grid[is][js];
        }
        
        int out1 = Integer.MAX_VALUE;
        int out2 = Integer.MAX_VALUE;
        
        if(dp[is][js] != -1) {
            return dp[is][js];
        }
        
        if(is < ie)
            out1 = grid[is][js] + func(grid, is + 1, ie, js, je, dp);
        
        if(js < je)
            out2 = grid[is][js] + func(grid, is, ie, js + 1, je, dp);
        
        return dp[is][js] = Math.min(out1, out2);
    }
}