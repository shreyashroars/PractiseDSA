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
    String str="";
    public void preorder(TreeNode root)
    {
        if(root==null)
            return;
        str+=root.val;
        if(root.left==null && root.right==null)
            return;
        str+="(";
        //call the left subtree
        preorder(root.left);
        str+=")";
        if(root.right!=null)  //if it has right child
        {
            str+="(";
            preorder(root.right);
            str+=")";
        }
        
    }
    public String tree2str(TreeNode root) {
        preorder(root);
        return str;
        
    }
}