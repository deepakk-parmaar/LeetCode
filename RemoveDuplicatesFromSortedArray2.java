class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        nums[j++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[j - 1] != nums[i]) {
                nums[j++] = nums[i];
            } else {
                if (j - 2 >= 0 && nums[j - 2] != nums[i]) {
                    nums[j++] = nums[i];
                } else if (j - 2 < 0) {
                    nums[j++] = nums[i];
                }
            }
        }
        return j;
    }
}