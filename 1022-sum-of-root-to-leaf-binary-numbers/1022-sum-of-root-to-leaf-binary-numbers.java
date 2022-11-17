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
      
    public void sumdedo(TreeNode root,String s)
    {
        if(root==null)
            return;
       s+=root.val;
        if(root.left==null && root.right==null)
        {
            sum+=Integer.parseInt(s,2);
             
        }
       sumdedo(root.left,s);
       sumdedo(root.right,s);             
        
    }
    public int sumRootToLeaf(TreeNode root) {
      String s="";
       sumdedo(root,s); 
        return sum;
    }
}