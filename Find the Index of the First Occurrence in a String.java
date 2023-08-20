class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i < m - n; i++) {
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    continue;
                }
                if (j == n - 1 && haystack.charAt(i) == needle.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}