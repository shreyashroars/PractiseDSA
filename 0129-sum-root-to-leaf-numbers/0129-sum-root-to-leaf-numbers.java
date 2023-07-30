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
    int ans=0;
    public void preorder(TreeNode root,int tempSum)
    {
        if(root==null)
            return;
        tempSum=tempSum*10+root.val;
        if(root.left==null && root.right==null)
        {
            ans+=tempSum;
            return;
        }
        preorder(root.left,tempSum);
        preorder(root.right,tempSum);
        
        
    }
    public int sumNumbers(TreeNode root) {
        preorder(root,0);
        return ans;
    }
}