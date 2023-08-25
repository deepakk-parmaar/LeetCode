class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, 0, ans, curr);
        return ans;
    }
    private void helper(int[] nums, int idx, List<List<Integer>> ans, List<Integer> curr){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums, idx+1, ans, curr);
        curr.remove(curr.size()-1);
        helper(nums, idx+1, ans, curr);
    }
}