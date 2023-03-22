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
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair<TreeNode,Long>>q=new LinkedList<>();
        int res=0;
        long endInd=0,startInd=0;
        q.offer(new Pair<TreeNode,Long>(root,(long)0));
        while(!q.isEmpty())
        {
             int cnt=q.size();
             startInd=q.peekFirst().getValue();
             endInd=q.peekLast().getValue();
             res=(int)Math.max(res,endInd-startInd+1);
            for(int i=0;i<cnt;i++)
            {
                Pair<TreeNode,Long>curr=q.poll();
                //long idx=curr.getValue()-startInd;
                if(curr.getKey().left!=null)
                    q.offer(new Pair<TreeNode,Long>(curr.getKey().left,(long)2*curr.getValue()+1));
                if(curr.getKey().right!=null)
                    q.offer(new Pair<TreeNode,Long>(curr.getKey().right,(long)2*curr.getValue()+2));
                
            }
        }
        return res;
        
    }
}