class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    setMatZero(matrix,i,j,m,n);
                }
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == -999) {
                   matrix[i][j] = 0;
                }
            }
        }
        
    }
    
    public void setMatZero(int[][] matrix, int si, int sj, int m, int n) {
        for(int j = 0; j < n; j++) {
            if(matrix[si][j] != 0)
            matrix[si][j] = -999;
        }
        for(int i = 0; i < m; i++) {
            if(matrix[i][sj] != 0)
            matrix[i][sj] = -999;
        }
    }
}