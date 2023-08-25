class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // check if first row has zero
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }

        // check if first column has zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // check for zeros in the rest of the array
        // if found, mark the first row and column of that zero as zero
        // we will use this information later to mark the entire row and column as zero
        // except the first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // mark the entire row as zero except the first row
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++)
                    matrix[i][j] = 0;
            }
        }

        // mark the entire column as zero except the first column
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < m; j++)
                    matrix[j][i] = 0;
            }
        }

        // mark the first row as zero if it had a zero
        if (firstRow) {
            for (int i = 0; i < n; i++)
                matrix[0][i] = 0;
        }

        // mark the first column as zero if it had a zero
        if (firstCol) {
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }
    }
}