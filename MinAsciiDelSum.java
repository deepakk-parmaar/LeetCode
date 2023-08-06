public class MinAsciiDelSum {
    public int minDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= m; i++) {
            dp[0][i] = dp[0][i - 1] + s2.charAt(i - 1);
        }
        for (int i = 0; i <= n; i++) {
            dp[n][0] = dp[n - 1][0] + s1.charAt(i - 1);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1] + s2.charAt(j - 1), dp[i - 1][j] + s1.charAt(i - 1));
                }
            }
        }
        return dp[n][m];
    }

}
