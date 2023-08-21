/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        int lstart = 0, lend = mid - 1, rstart = mid + 1, rend = nums.length - 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, lstart, lend);
        root.right = sortedArrayToBST(nums, rstart, rend);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid+1, end);
        return root;
    }
}