/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> st = new Stack<>();
        kthSmallest(root, k, st);
        for (int i = st.size(); i > k; i--) {
            st.pop();
        }
        return st.pop();
    }

    private void kthSmallest(TreeNode root, int k, Stack<Integer> st) {
        if (root == null || st.size() >= k) {
            return;
        }
        kthSmallest(root.left, k, st);
        st.add(root.val);
        kthSmallest(root.right, k, st);
    }
}