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
    TreeNode node;
    int ind;
    Pair(TreeNode n,int i)
    {
        node=n;
        ind=i;
    }
    
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
      Queue<Pair>q=new LinkedList<>();
        int max=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int lm=q.peek().ind;
            int rm=q.peek().ind;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pair p=q.poll(); 
                if(i==size-1)
                {
                    rm=p.ind;
                }
                if(p.node.left!=null)
                    q.add(new Pair(p.node.left,2*p.ind+1));
                if(p.node.right!=null)
                    q.add(new Pair(p.node.right,2*p.ind+2));
                
                
            }
            System.out.println(lm+" "+rm);
            max=Math.max(max,rm-lm+1);
        }
        return max;
        
    }
}