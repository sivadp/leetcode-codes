class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return backtrack(0, 0, m, n, dp);
    }

    private int backtrack(int i, int j, int m, int n, int[][] dp) {
        // Check if we have reached the bottom-right corner
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Check if the result is already memoized
        if (dp[i][j] > 0) {
            return dp[i][j];
        }

        int down = 0, right = 0;

        // Move down if within grid bounds
        if (i + 1 < m) {
            down = backtrack(i + 1, j, m, n, dp);
        }

        // Move right if within grid bounds
        if (j + 1 < n) {
            right = backtrack(i, j + 1, m, n, dp);
        }

        // Memoize the result
        dp[i][j] = down + right;

        return dp[i][j];
    }
}
