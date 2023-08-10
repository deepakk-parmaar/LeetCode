class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid + 1] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}