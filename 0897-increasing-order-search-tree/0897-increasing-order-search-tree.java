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
    public TreeNode incbst(TreeNode root,TreeNode tail)
    {
        if(root==null)
            return tail;
        TreeNode res=incbst(root.left,root);
        root.left=null;
        root.right=incbst(root.right,tail);
        return res;
    }
    public TreeNode increasingBST(TreeNode root) {
        return incbst(root,null);
    }
}