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
    int res=-60000;
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        res=Math.max(res,root.val+left+right);
        res=Math.max(res,root.val);
        res=Math.max(res,root.val+left);
        res=Math.max(res,root.val+right);
       return Math.max(Math.max(left,right)+root.val,root.val);
            
    }
    public int maxPathSum(TreeNode root) {
       int y= height(root);
        return res;
        
    }
}