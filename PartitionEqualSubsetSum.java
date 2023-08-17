class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int n = nums.length + 1;
        int m = sum / 2 + 1;
        boolean dp[][] = new boolean[m][n];
        dp[0][0] = true;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (i <= nums[j - 1]) {
                    dp[i][j] = dp[i - nums[j - 1]][j - 1] || dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}