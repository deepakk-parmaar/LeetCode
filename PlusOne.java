class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        digits[n] += 1;
        while (n > 0 && digits[n] == 10) {
            digits[n--] = 0;
            digits[n] += 1;
        }
        if (n == 0 && digits[n] == 10) {
            digits[n] = 0;
            int ans[] = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i--) {
                ans[i + 1] = digits[i];
            }
            ans[0] = 1;
            return ans;
        } else {
            return digits;
        }
    }
}