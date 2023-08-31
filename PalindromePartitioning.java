class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        boolean dp[][] = new boolean[s.length()][s.length()];
        partition(s, 0, current, result, dp);
        return result;
    }

    private void partition(String s, int start, List<String> current, List<List<String>> result, boolean dp[][]) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
                dp[start][end] = true;
                current.add(s.substring(start, end + 1));
                partition(s, end + 1, current, result, dp);
                current.remove(current.size() - 1);
            }
        }
    }
}