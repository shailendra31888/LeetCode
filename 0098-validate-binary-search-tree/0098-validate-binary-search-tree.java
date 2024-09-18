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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);  // Start with no bounds
    }
    
    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;  // An empty tree is a valid BST
        }
        
        int val = node.val;
        
        // Check if the current node value violates the BST properties
        if (lower != null && val <= lower) {
            return false;  // Should be greater than the lower bound
        }
        if (upper != null && val >= upper) {
            return false;  // Should be less than the upper bound
        }
        
        // Recursively check the subtrees with updated bounds
        if (!helper(node.right, val, upper)) {
            return false;  // Right subtree must have values > current node value
        }
        if (!helper(node.left, lower, val)) {
            return false;  // Left subtree must have values < current node value
        }
        
        return true;  // If all checks passed, the tree is a valid BST
    }
}
