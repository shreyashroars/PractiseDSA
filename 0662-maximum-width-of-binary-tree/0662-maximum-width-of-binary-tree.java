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
class Pair
{
    TreeNode root;
    int ind;
    Pair(TreeNode root,int ind)
    {
        this.root=root;
        this.ind=ind;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int res=-1;
        while(!q.isEmpty())
        {
            int lh=0,rh=0;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pair p=q.poll();
                if(i==0)
                    lh=p.ind;
                if(i==size-1)
                    rh=p.ind;
                if(p.root.left!=null)
                    q.add(new Pair(p.root.left,2*p.ind+1));
                if(p.root.right!=null)
                    q.add(new Pair(p.root.right,2*p.ind+2));
                    
            }
            res=Math.max(res,rh-lh+1);
            
        }
        return res;
        
        
    }
}