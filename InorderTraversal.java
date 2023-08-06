import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            TreeNode curr = root;
            while (curr != null) {
                if (curr.left == null) {
                    ans.add(curr.val);
                    curr = curr.right;
                } else {
                    TreeNode inorderPredecessor = curr.left;
                    while (inorderPredecessor.right != null && inorderPredecessor.right != curr) {
                        inorderPredecessor = inorderPredecessor.right;
                    }
                    if (inorderPredecessor.right == null) {
                        inorderPredecessor.right = curr;
                        curr = curr.left;
                    } else {
                        inorderPredecessor.right = null;
                        ans.add(curr.val);
                        curr = curr.right;
                    }
                }
            }
            return ans;
        }
    }
}
