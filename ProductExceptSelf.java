public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // prefix and suffix approach
        int n = nums.length;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        for (int i = 0, suffix = 1, prefix = 1; i < n; i++) {
            result[i] *= prefix;
            prefix *= nums[i];
            result[n - 1 - i] *= suffix;
            suffix *= nums[n - 1 - i];
        }
        return result;
    }
}
