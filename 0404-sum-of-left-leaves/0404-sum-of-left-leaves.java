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
    int sum=0, i=1;
    public void inorder(TreeNode root)
    {
       if(root==null)
           return;
        if(root.left!=null)
            i=0;
        inorder(root.left);
        if(i==0 && root.left==null && root.right==null)
        {
            sum+=root.val;
            ///i=1;
        }
        i=1;
        inorder(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
     inorder(root);   
     return sum;
        
    }
}