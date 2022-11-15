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
    public int ifBal(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=ifBal(root.left);
        if(l==-1)
            return -1;
        int r=ifBal(root.right);
        if(r==-1)
            return -1;
        if(Math.abs(r-l)>1)
            return -1;
        else
            return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
      return ifBal(root)==-1?false:true;  
    }
}