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
    int s=0;
   
    public void inorderkaulta(TreeNode root)
    {
       if(root==null)
           return;
        inorderkaulta(root.right);
        s+=root.val;
       root.val=s;
        inorderkaulta(root.left);
    }
  
    public TreeNode bstToGst(TreeNode root) {
    inorderkaulta(root);
        
        return root;
    }
}