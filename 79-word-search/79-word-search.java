class Solution {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        visited = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (word.charAt(0) == board[i][j] && search(board, word, row, column, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int row, int column, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= row || j >= column || word.charAt(index) != board[i][j] || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        if (
            search(board, word, row, column, i + 1, j, index + 1) ||
            search(board, word, row, column, i - 1, j, index + 1) ||
            search(board, word, row, column, i, j + 1, index + 1) ||
            search(board, word, row, column, i, j - 1, index + 1)
        ) return true;

        visited[i][j] = false;
        return false;
    }
}
