class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> rowDigits = new HashSet<>();
        Set<Integer> colDigits = new HashSet<>();
        Set<Integer> cubeDigits = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            int temp = 10;
            for (int j = 0; j < 9; j++) {

                boolean rowResult = rowDigits.add((board[i][j] != '.') ? Character.getNumericValue(board[i][j]) : temp++);
                boolean colResult = colDigits.add((board[j][i] != '.') ? Character.getNumericValue(board[j][i]) : temp++);

                if (!rowResult || !colResult) {
                    return false;
                }
                if (i == 0) {
                    int startRow = 3 * (j / 3);
                    int startCol = 3 * (j % 3);

                    for (int k = startRow; k < startRow + 3; k++) {
                        for (int l = startCol; l < startCol + 3; l++) {
                            boolean cubeResult = cubeDigits.add((board[k][l] != '.') ? Character.getNumericValue(board[k][l]) : temp++);
                            if (!cubeResult) {
                                return false;
                            }
                        }
                    }
                }
                cubeDigits.clear();
            }
            rowDigits.clear();
            colDigits.clear();
        }
        return true;
    }
}
