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
    int sum=0;int tSum;
    boolean f=false;
    public void preorder(TreeNode root,int sum)
    {
        if(root==null)
            return;
         if(root.left==null && root.right==null)
       {
             sum+=root.val;
           if(sum==tSum)
               f = true; 
              return;
       }
            sum+=root.val;
        preorder(root.left,sum);
        preorder(root.right,sum);
           
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root==null)
           return false;
        tSum=targetSum;
       // sum=root.val;
        preorder(root,sum);
        return f;
        
    }
}