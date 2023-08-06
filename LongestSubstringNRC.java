public class LongestSubstringNRC {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder test = new StringBuilder("");
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (test.indexOf(String.valueOf(c)) != -1) {
                test.delete(0, test.indexOf(String.valueOf(c)) + 1);
            }
            test.append(c);
            max = Math.max(max, test.length());
        }
        return max;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
