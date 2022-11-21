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
    int sum=0;
    void gp(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        if(root.val%2==0)
        {
            if(root.left!=null)
            {
            sumk(root.left.right);
            sumk(root.left.left);
            }
            if(root.right!=null)
            {
            sumk(root.right.left);
            sumk(root.right.right);
            }
           
        }
            gp(root.left);
            gp(root.right);
        
    }
    void sumk(TreeNode root)
    {
        if(root!=null)
            sum+=root.val;
    }
    public int sumEvenGrandparent(TreeNode root) {
      gp(root);  
     return sum;
    }
}