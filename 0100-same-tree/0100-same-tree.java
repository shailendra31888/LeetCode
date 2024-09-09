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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p, q);  // Directly return the result of the helper
    }

    private boolean helper(TreeNode p, TreeNode q) {
        // Base case: both nodes are null, so they are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of them is null and the other is not, they are different
        if (p == null || q == null) {
            return false;
        }

        // Check if the current node values are the same, and recurse for left and right children
        if (p.val != q.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return helper(p.left, q.left) && helper(p.right, q.right);
    }
}
