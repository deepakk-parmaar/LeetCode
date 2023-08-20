class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = { -1, -1 };
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                result[1] = mid;
                int i = mid - 1;
                while (i >= 0 && nums[i] == target) {
                    result[0] = i;
                    i--;
                }
                int j = mid + 1;
                while (j <= nums.length - 1 && nums[j] == target) {
                    result[1] = j;
                    j++;
                }
                break;
            } else if (start >= 0 && end <= nums.length - 1 && nums[mid] < target && target <= nums[end]) {
                start = mid + 1;
            } else if (start >= 0 && end <= nums.length - 1 && nums[start] <= target && target < nums[mid]) {
                end = mid - 1;
            } else {
                break;
            }
        }
        return result;
    }
}
