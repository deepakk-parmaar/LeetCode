import java.util.Random;

class Solution {
    int[] nums;
    int[] original;
    Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();

    }

    public int[] reset() {
        return original;

    }

    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            int j = rand.nextInt(i + 1);
            swap(nums, i, j);
        }
        return nums;

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */