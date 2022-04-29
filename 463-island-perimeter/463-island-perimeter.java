class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int n = grid.length;
        
        int m = grid[0].length;
        
        
        int pem = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    pem += check(grid, i, j, n, m);
                }
            }
        }
        
        return pem;
        
    }
    
    public static int check(int[][] grid, int i, int j, int n, int m){
        int score = 0;
        
        if(j > 0){
            if(grid[i][j-1] == 0){
                score += 1;
            }
        }
        else{
            score += 1;
        }
        
        
        if(j < m-1){
            if(grid[i][j+1] == 0){
                score += 1;
            } 
        }
        else{
            score += 1;
        }
        
        
        if(i > 0){
            if(grid[i-1][j] == 0){
                score += 1;
            }  
        }
        else{
            score += 1;
        }
        
        if(i < n-1){
            if(grid[i+1][j] == 0){
                score += 1;
            }    
        }
        else{
            score += 1;
        }
        
        return score;
        
        
    }
}