import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void permute(int nums[], int begin, List<List<Integer>> result) {
        if (begin == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i : nums) {
                temp.add(i);
            }
            result.add(temp);
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            //swap
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;

            permute(nums, begin + 1, result);
            
            //revert
            temp = nums[begin];
            nums[begin]= nums[i];
            nums[i] = temp;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5};
        permute(nums);
    }
}