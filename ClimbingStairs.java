class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1; // 1 way to climb 0 stairs
        dp[1] = 1; // 1 way to climb 1 stairs
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // 1 way to climb 1 stairs + 1 way to climb 2 stairs
        }
        return dp[n];
    }
}