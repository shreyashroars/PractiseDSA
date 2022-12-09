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
    List<List<Integer>>arr=new ArrayList<>();
   
    public void l_order(TreeNode root)
    {
        if(root==null)
            return ;
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);
      //  int i=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer>ar=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                ar.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            arr.add(ar);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
      l_order(root);
        return arr;
    }
}