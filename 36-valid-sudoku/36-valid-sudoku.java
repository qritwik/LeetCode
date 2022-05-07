class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if(ch != '.') {
                    String row = ch + "found in row " + i;
                    String column = ch + "found in column " + j;
                    String box = ch + "found in box " + i/3 + "-" + j/3;
                    if(!seen.add(row) || !seen.add(column) || !seen.add(box)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}