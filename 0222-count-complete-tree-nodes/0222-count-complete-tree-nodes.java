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
    public int countNodes(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return 0;
        q.add(root);
        int i=0;
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr.right==null)
            {
                if(curr.left==null)
                    return 2*i+1;
                else
                    return 2*i+2;
                    
            }
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            i++;
        }
        return -1;
        
    }
}