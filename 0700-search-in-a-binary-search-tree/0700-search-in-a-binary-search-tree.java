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
    public TreeNode search(TreeNode root,int val)
    {
        if(root==null)
            return root;
        else if(root.val==val)
            return root;
        else if(root.val<val)
          return  search(root.right,val);
        else
            return search(root.left,val);
        
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
        
    }
}