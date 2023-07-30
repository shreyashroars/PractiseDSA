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
    public int height(TreeNode node)
    {
        if(node==null)
            return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    public int diam(TreeNode root)
    {
        if(root==null)
            return -60000;
        int left=height(root.left);
        int right=height(root.right);
        int rs=left+right;
        return Math.max(rs,Math.max(diam(root.left),diam(root.right)));
    }
    public int diameterOfBinaryTree(TreeNode root) {
       return  diam(root);
        
    }
}