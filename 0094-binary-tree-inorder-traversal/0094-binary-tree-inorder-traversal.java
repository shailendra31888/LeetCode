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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls= new  ArrayList<>();
        if(root==null){
            return ls;
        }
        Stack<TreeNode> st= new Stack<>();
        TreeNode temp = root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                temp = st.pop();
                ls.add(temp.val);
                temp=temp.right;
            }
        }
        return ls;
        
    }
}