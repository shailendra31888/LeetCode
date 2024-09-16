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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lp = new  ArrayList<>();
        helper(lp,root,0);
        return lp;
    }
    public void helper(List<List<Integer>> lp,TreeNode root,int h){
        if(root == null){
            return;
        }
        if(h==lp.size()){
            lp.add(new ArrayList<>());
        }
        lp.get(h).add(root.val);
        helper(lp,root.left,h+1);
        helper(lp,root.right,h+1);
    }

}