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
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
       int t=root.val;
        while(!q.isEmpty())
        {
            if(t!=q.peek().val)
                return false;
            TreeNode curr=q.poll();
              t=curr.val;
        if(curr.left!=null)
        {
            q.add(curr.left);
           
        }
        if(curr.right!=null)
            q.add(curr.right);
        
    }
    return true;}
}