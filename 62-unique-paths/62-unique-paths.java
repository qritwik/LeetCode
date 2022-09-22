class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int count = 0;
        count = func(0, m-1, 0, n-1, count, dp);
        return count;
    }
    
    public int func(int is, int ie, int js, int je, int count, int[][] dp) {
        
        if(is == ie && js == je) {
            count++;
            return dp[is][js] = count;
        }
        
        if(is > ie || js > je) {
            return 0;
        }
        
        if(dp[is][js] != -1) {
            return dp[is][js];
        }
        
        int out1 = func(is+1, ie, js, je, count, dp);
        int out2 = func(is, ie, js+1, je, count, dp);
        return dp[is][js] = out1 + out2;
    }
}