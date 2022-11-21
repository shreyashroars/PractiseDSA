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
   int maxLevel=0;
    int sum=0;
    void sumk(TreeNode root,int level)
    {
        if(root==null)
            return;
       
        if(maxLevel==level)
             if(root.left==null && root.right==null)
        {
            sum+=root.val;
             }
        if(maxLevel<level)
        {
             if(root.left==null && root.right==null)
        {
            sum=root.val;
             }
            maxLevel=level;
        }
    
         sumk(root.left,level+1);
         sumk(root.right,level+1);
    }
    public int deepestLeavesSum(TreeNode root) {
        
        sumk(root,1);
        return sum;
    }
}