class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidSub(board, i, 0, i, 8)) return false; // Check rows
            if (!isValidSub(board, 0, i, 8, i)) return false; // Check columns
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValidSub(board, i * 3, j * 3, i * 3 + 2, j * 3 + 2)) return false; // Check 3x3 squares
            }
        }

        return true;
    }

    private boolean isValidSub(char[][] board, int rowStart, int colStart, int rowEnd, int colEnd) {
        Set<Character> seen = new HashSet<>();
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                char current = board[i][j];
                if (current != '.' && !seen.add(current)) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }
}
