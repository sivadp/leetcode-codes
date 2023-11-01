class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, 0, i, j, m, n)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, String word, int ind, int i, int j, int m, int n) {
        if (ind == word.length()) {
            return true;
        }

        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(ind)) {
            return false;
        }

        char original = board[i][j];
        board[i][j] = '!';

        if (backtrack(board, word, ind + 1, i + 1, j, m, n) ||
            backtrack(board, word, ind + 1, i - 1, j, m, n) ||
            backtrack(board, word, ind + 1, i, j + 1, m, n) ||
            backtrack(board, word, ind + 1, i, j - 1, m, n)) {
            return true;
        }

        board[i][j] = original; 
        return false;
    }
}
