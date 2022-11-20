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
    int l=0,min=1000000;
    public void trav(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
           int cnt=q.size();
            l++;
            for(int i=0;i<cnt;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left==null && curr.right==null)
                    min=Math.min(min,l);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!= null)
                    q.add(curr.right);
            }
            
        }
    }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        trav(root);
        return min;
        
    }
}