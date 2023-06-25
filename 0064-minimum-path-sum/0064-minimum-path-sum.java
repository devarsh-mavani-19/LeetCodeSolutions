class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                if (i > 0) {
                    up = dp[i-1][j];
                }
                if (j > 0) {
                    left = dp[i][j-1];
                }
                if (up > left) {
                    dp[i][j] = left + grid[i][j];
                } else {
                    dp[i][j] = up + grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}