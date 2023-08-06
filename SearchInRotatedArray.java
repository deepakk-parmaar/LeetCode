class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0]==target?0:-1;
        }
        int n = nums.length;
        return searchUtil(nums, target, 0, n-1);
    }

    private int searchUtil(int nums[], int target, int begin, int end) {
        int mid = (begin + end) / 2;
        if (begin > end) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[begin] <= nums[mid]) {
            if (nums[begin] <= target && target <= nums[mid]) {
                return searchUtil(nums, target, begin, mid - 1);
            } else {
                return searchUtil(nums, target, mid + 1, end);
            }
        } else {
            if (nums[mid] <= target && target <= nums[end]) {
                return searchUtil(nums, target, mid + 1, end);
            } else {
                return searchUtil(nums, target, begin, mid - 1);
            }
        }

    }
}