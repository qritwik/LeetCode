class Solution {
    int count;
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        return uniquePathsHelper(0, m-1, 0, n-1, "");
    }
    
    public int uniquePathsHelper(int si, int ei, int sj, int ej, String path) {
        if(si > ei || sj > ej) {
            return 0;
        }
        else if(si == ei && sj == ej) {
            return 1;
        }
        else if (memo[si][sj] > 0) {
            return memo[si][sj];
        }
        else {
            memo[si][sj] = uniquePathsHelper(si+1, ei, sj, ej, path+"D") + uniquePathsHelper(si, ei, sj+1, ej, path+"R");
            return memo[si][sj];
        }
    }
}