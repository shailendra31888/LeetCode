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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> llp = new ArrayList<>();
        List<List<Integer>> lllp = new ArrayList<>();
        help(llp,root,0);
        for(int i = llp.size()-1;i>=0;i--){
            lllp.add(llp.get(i));
        }
        return lllp;
        
    }
    public void help(List<List<Integer>> lp, TreeNode root,int h){
        if(root == null){
            return ;
        }
        if(h==lp.size()){
            lp.add(new ArrayList<>());
        }
        lp.get(h).add(root.val);
        help(lp,root.left,h+1);
        help(lp,root.right,h+1);
    }
}