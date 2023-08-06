import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder("");
        for (String str : s) {
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;

    }
}