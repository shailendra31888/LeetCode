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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        answer(root, 0, ls);
        
        // Reverse lists at odd levels to achieve zigzag order
        for (int i = 1; i < ls.size(); i += 2) {
            Collections.reverse(ls.get(i));
        }
        
        return ls;
    }

    public void answer(TreeNode root, int h, List<List<Integer>> ls) {
        if (root == null) {
            return;
        }
        
        // If we are at a new level, create a new list
        if (h == ls.size()) {
            ls.add(new ArrayList<>());
        }
        
        // Add the current node's value to the list for this level
        ls.get(h).add(root.val);
        
        // Traverse the left and right subtrees
        answer(root.left, h + 1, ls);  // Traverse left subtree
        answer(root.right, h + 1, ls); // Traverse right subtree
    }
}