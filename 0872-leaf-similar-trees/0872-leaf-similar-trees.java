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
       String s1="",s2="",s="";
    public void hkp(TreeNode root)
    {
         if(root==null)
             return;
        
        if(root.left==null && root.right==null)
        {
            s1+=root.val+" ";
            return;
        }
        hkp(root.left);
        hkp(root.right);
    }
     public void hkp2(TreeNode root)
    {
         if(root==null)
             return;
        if(root.left==null && root.right==null)
        {
            s2+=root.val+" ";
            return;
        }
        hkp2(root.left);
        hkp2(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       
         hkp(root1);
         hkp2(root2);
      return s2.equals(s1);  
    }
}