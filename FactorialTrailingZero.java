class Solution {
    public int trailingZeroes(int n) {
        int n5 = 0;
        while (n > 0) {
            n = n / 5;
            n5 += n;
        }
        return n5;
    }
}