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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {

        depth(root);
        return diameter;
        
    }
    public int depth(TreeNode node){
        if(node==null) return 0;
        int l=depth(node.left);
        int r=depth(node.right);
        diameter = Math.max(diameter,l+r);
        return 1 + Math.max(l,r);
        
    }
}