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
    int sum;
    int height(TreeNode root)
    {
       if(root==null)
           return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    void sumk(TreeNode root,int k)
    {
        if(root==null)
            return;
        if(k==1)
            sum+=root.val;
         sumk(root.left,k-1);
         sumk(root.right,k-1);
    }
    public int deepestLeavesSum(TreeNode root) {
       int k= height(root);
        sumk(root,k);
        return sum;
    }
}