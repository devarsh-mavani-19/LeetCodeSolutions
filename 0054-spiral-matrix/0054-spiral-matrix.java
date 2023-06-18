class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        while (i <= m && j <= n) {
            //top row
            for (int x = j;x <= n;x++) {
                list.add(matrix[i][x]);
            }
            i++;

            // last col
            for (int x = i;x <= m;x++) {
                list.add(matrix[x][n]);
            }
            n--;

            // last row
            if (i <= m)
                for (int x = n;x >= j;x--) {
                    list.add(matrix[m][x]);
                }
            m--;

            // first col
            if (j <= n)
                for (int x = m;x >= i;x--) {
                    list.add(matrix[x][j]);
                }
            j++;
        }
        return list;

    }
}