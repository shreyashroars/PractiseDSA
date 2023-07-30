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
     boolean st=true;
    boolean flag=true;
    int a=0;
    void inorder(TreeNode root)
    {
        if(root==null)
        return ;
         inorder(root.left);
        if(st!=true)
        {
        if(root.val<=a)
        {
        flag =false;
        return;
        }
        a=root.val;
        }
        else
        {
        a=root.val;
        st=false;
        }
        inorder(root.right);
        
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
        
    }
}