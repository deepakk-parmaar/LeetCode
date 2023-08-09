class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[i] - nums[0];
        while (left < right) {
            int mid = (left + right) / 2, k = 0;
            for (int i = 1; i < nums.length && k < p; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    k++;
                    i++;
                }
            }
            if (k >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}