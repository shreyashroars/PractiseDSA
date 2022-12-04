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
    int l,h,s=0;
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        if(root.val>=l && root.val<=h)
            s+=root.val;
        inorder(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        l=low;
        h=high;
        inorder(root);
        return s;
    }
}