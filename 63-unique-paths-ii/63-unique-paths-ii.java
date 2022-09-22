class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }
        int count = 0;
        count = func(obstacleGrid, 0, m-1, 0, n-1, count, dp);
        return count;
    }
    
    public int func(int[][] obstacleGrid, int is, int ie, int js, int je, int count, int[][] dp) {
        
        if(is > ie || js > je) {
            return 0;
        }
        
        if(obstacleGrid[is][js] == 1) {
            return 0;
        }
        
        if(is == ie && js == je) {
            count++;
            return dp[is][js] = count;
        }
        
        if(dp[is][js] != -1) {
            return dp[is][js];
        }
        
        int out1 = func(obstacleGrid, is+1, ie, js, je, count, dp);
        int out2 = func(obstacleGrid, is, ie, js+1, je, count, dp);
        
        return dp[is][js] = out1 + out2;
    }
}