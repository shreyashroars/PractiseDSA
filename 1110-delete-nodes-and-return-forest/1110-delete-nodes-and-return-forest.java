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
    private List<TreeNode> res;
    private HashSet<Integer> toBeDeleted;
    
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res = new ArrayList<>();
        toBeDeleted = new HashSet<>();
        for (int i = 0; i < to_delete.length; i++) {
            toBeDeleted.add(to_delete[i]);
        }
        
        TreeNode node = dfs(root);
        if ( node!=null) res.add(node);
        
        return res;
    }
    
    private TreeNode dfs(TreeNode node) {
        if (node==null) return null;
        
        node.left = dfs(node.left);
        node.right = dfs(node.right);
        
        if (!toBeDeleted.contains(node.val)) {
            return node;
        }

        if (node.left != null) res.add(node.left);
        if (node.right != null) res.add(node.right);
        return null;
    }
}