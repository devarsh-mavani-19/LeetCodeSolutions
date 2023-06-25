class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] arr) {
        // dp = new int[arr.length][arr[0].length];
        int m = arr.length;
        int n = arr[0].length;

        int[] prev = new int[n];

        for (int i = 0;i < m;i++) {
            int[] temp = new int[n];
            for (int j = 0;j < n;j++) {
                if (i == 0 && j == 0 && arr[i][j] == 0) {
                    temp[j] = 1;
                } else if (arr[i][j] == 1) {
                    temp[j] = 0;
                } else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) {
                        up = prev[j];
                    }
                    if (j > 0) {
                        left = temp[j-1];
                    }
                    temp[j] = up + left;
                }
            }
            prev = temp;
        }
        return prev[n-1];

        // for (int i = 0;i < obstacleGrid.length;i++) Arrays.fill(dp[i], -1);
        // return uniquePathsWithObstacles(obstacleGrid, 0, 0);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid, int row, int col) {
        if (row > obstacleGrid.length - 1) {
            return 0;
        }
        if (col > obstacleGrid[0].length - 1) {
            return 0;
        }

        if (obstacleGrid[row][col] == 1) return 0;

        if (row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) {
            return 1;
        }
        if (dp[row][col]!=-1) return dp[row][col];
        int a = uniquePathsWithObstacles(obstacleGrid, row+1, col);
        int b = uniquePathsWithObstacles(obstacleGrid, row, col+1);

        int count = 0;
        count+=a;
        count+=b;

        dp[row][col] = count;

        return count;
    }

}