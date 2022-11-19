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
    int c=0;
    int root1=0;
    public void traverse(TreeNode root,int x)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
              c++;
            int cnt=q.size();
            for(int i=0;i<cnt;i++)
            {
                 TreeNode curr=q.poll();
                
                if((curr.left!=null && curr.left.val==x)||(curr.right!=null && curr.right.val==x))
            {
                root1=curr.val;
                return;
            }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root,x);
        int c1=c;
       int root2=root1;
        root1=0;
        c=0;
        traverse(root,y);
      return c1==c && root1!=root2;  
    }
}