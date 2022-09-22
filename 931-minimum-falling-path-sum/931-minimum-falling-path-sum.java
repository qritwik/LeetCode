class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min_val = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++) {
            min_val = Math.min(min_val, func(matrix, 0, j, n-1, dp));
        }
        return min_val;
    }
    
    public int func(int[][] matrix, int i, int j, int n, int[][] dp) {
        
        if(i == n) {
            return matrix[i][j];
        }
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int out1 = Integer.MAX_VALUE;
        int out2 = Integer.MAX_VALUE;
        int out3 = Integer.MAX_VALUE;
        
        if(i < n && j > 0)
        out1 = func(matrix, i+1, j-1, n, dp);
        
        if(i < n)
        out2 = func(matrix, i+1, j, n, dp);
        
        if(i < n && j < n)
        out3 = func(matrix, i+1, j+1, n, dp);
        
        return dp[i][j] = matrix[i][j] + Math.min(Math.min(out1, out2), out3);
        
    }
}