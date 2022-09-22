class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n+1][n+1];
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return func(triangle, 0, 0, dp);
    }
    
    public int func(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        
        if(i == triangle.size()-1) {
            return triangle.get(i).get(j);
        }
        
        if(i >= triangle.size() || j >= triangle.get(i).size()) {
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int out1 = triangle.get(i).get(j) + func(triangle, i+1, j, dp);
        int out2 = triangle.get(i).get(j) + func(triangle, i+1, j+1, dp);
        
        return dp[i][j] = Math.min(out1, out2);
    }
}
