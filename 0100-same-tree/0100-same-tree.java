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
    String st="";
    public void traverse(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
         while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            st+=curr.val;
            if(curr.left!=null)
                q.add(curr.left);     
            if(curr.right!=null)
                q.add(curr.right);
             if(!(curr.left==null &&curr.right==null) && curr.left==null)
                 st+=" ";
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
   
        if(p==null && q==null)
            return true;
        if(q==null ||p==null)
            return false;
        traverse(p);
        String temp=st;
        st="";
        traverse(q);
        return st.equals(temp);       
        
    }
}