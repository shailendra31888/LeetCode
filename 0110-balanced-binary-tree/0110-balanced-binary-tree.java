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
 import java.util.*;
class Solution {
    public boolean isBalanced(TreeNode root) {
        // If the result of the height function is -1, then the tree is not balanced.
        return height(root) != -1;
    }

    public int height(TreeNode root) {
        // Base case: if the node is null, its height is 0.
        if (root == null) {
            return 0;
        }

        // Recursively get the height of the left subtree.
        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced

        // Recursively get the height of the right subtree.
        int rightHeight = height(root.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced

        // If the current node is not balanced, return -1.
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise, return the height of the tree from this node.
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
