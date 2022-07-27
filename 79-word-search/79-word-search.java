class Solution {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j] && boardHelper(board, i, j, m, n, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean boardHelper(char[][] board, int i, int j, int m, int n, int index, String word) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= m || j >= n || word.charAt(index) != board[i][j] || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;

        boolean ans1 = boardHelper(board, i + 1, j, m, n, index + 1, word);
        boolean ans2 = boardHelper(board, i - 1, j, m, n, index + 1, word);
        boolean ans3 = boardHelper(board, i, j + 1, m, n, index + 1, word);
        boolean ans4 = boardHelper(board, i, j - 1, m, n, index + 1, word);

        if (ans1 || ans2 || ans3 || ans4) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}
