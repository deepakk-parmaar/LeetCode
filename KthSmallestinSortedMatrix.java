class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int i = k / matrix.length;
        int j = k % matrix.length;
        return matrix[i][j];
    }
}