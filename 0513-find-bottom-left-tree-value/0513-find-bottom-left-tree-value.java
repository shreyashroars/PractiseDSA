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
    int maxlevel=0,ans;
    public void lleft(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(maxlevel<level)
        {
            ans=root.val;
            maxlevel=level;
        }
        lleft(root.left,level+1);
        lleft(root.right,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
     lleft(root,1); 
        return ans;
    }
}