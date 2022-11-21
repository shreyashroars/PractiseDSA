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
    int c=0,sum=0, nd=0;
    void avg(TreeNode root)
    {
         if(root==null)
           return;
        getSum(root);
        if(root.val==sum/nd)
            c++;
        nd=0;
        sum=0;
        avg(root.left);
        avg(root.right);
    }
    void getSum(TreeNode root)
    {
        if(root==null)
            return;
        sum+=root.val;
        nd++;
        getSum(root.left);
        getSum(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
      avg(root);
      return c;
        
    }
}