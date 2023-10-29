class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Create a DP table to store the minimum path sum values
        int[][] dp = new int[m][n];

        // Initialize the top-left cell with its value
        dp[0][0] = grid[0][0];

        // Initialize the first row
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Initialize the first column
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill in the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // Choose the minimum path sum from the top and left cells
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // The bottom-right cell contains the minimum path sum
        return dp[m - 1][n - 1];
    }
}
