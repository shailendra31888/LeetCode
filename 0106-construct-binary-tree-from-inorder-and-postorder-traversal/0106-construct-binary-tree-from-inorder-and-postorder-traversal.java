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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(postorder,inorder,0,postorder.length-1,0,inorder.length-1,map);
    }
    public TreeNode construct(int[] postorder,int[] inorder,int poststart,int postend,int instart,int inend,Map<Integer,Integer> map){
        if(instart>inend || postend<0){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postend]);
        int index=map.get(postorder[postend]);
        int left_size=index-instart;
        root.left=construct(postorder,inorder,poststart,poststart+left_size-1,instart,index-1,map);
        root.right=construct(postorder,inorder,poststart+left_size,postend-1,index+1,inend,map);
        return root;
    }
}