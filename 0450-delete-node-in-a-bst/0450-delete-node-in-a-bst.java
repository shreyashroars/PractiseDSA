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
    public TreeNode getSucc(TreeNode root)
    {
        TreeNode succ=root.right;
        while(succ!=null && succ.left!=null)
        succ=succ.left;
        return succ;
    }
    public TreeNode deleteNode(TreeNode root, int x) {
        if(root==null)
        return null;
        if(root.val>x)
        root.left=deleteNode(root.left,x);
         else if(root.val<x)
        root.right=deleteNode(root.right,x);
        else
        {
        if(root.left==null)
        return root.right;
       else if(root.right==null)
        return root.left;
        else
        {
            TreeNode succ=getSucc(root);
            root.val=succ.val;
            root.right=deleteNode(root.right,succ.val);
        }
        }
        return root;
    }
}