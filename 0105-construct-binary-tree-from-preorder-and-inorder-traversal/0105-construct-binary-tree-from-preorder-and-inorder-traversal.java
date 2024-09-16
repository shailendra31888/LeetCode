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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode construct(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, Map<Integer, Integer> map) {
        
        if (prestart > preend || instart > inend) {
            return null;
        }
        
       
        TreeNode root = new TreeNode(preorder[prestart]);
        int index = map.get(preorder[prestart]);

        int left_size = index - instart;

        
        root.left = construct(preorder, prestart + 1, prestart + left_size, inorder, instart, index - 1, map);
        root.right = construct(preorder, prestart + left_size + 1, preend, inorder, index + 1, inend, map);

        return root;
    }
}
