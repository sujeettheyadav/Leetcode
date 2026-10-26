class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] zero = new boolean[m][n];
        // Step 1: Remember the original zero positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zero[i][j] = true;
                }
            }
        }
        // Step 2: Make the corresponding rows and columns zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zero[i][j]) {
                    for (int k = 0; k < n; k++) {
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < m; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }
}