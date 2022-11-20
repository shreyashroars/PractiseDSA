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
    Deque<Integer>st=new LinkedList<>();
    public void trav(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return;
        q.add(root);
        while(!q.isEmpty())
        {
            int cnt=q.size();
            for(int i=0;i<cnt;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    st.offerLast(curr.left.val);
                }
                 if(curr.left==null)
                 {
                     st.offerLast(-101);
                 }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                        st.offerLast(curr.right.val);
                }
                if(curr.right==null)
                {
                     st.offerLast(-101);
                }
                   
          
        }
              while(!st.isEmpty())
              {
                  if(st.peekFirst()==st.peekLast())
                  {
                      st.pollFirst();
                      st.pollLast();
                  }
                  else
                      return ;
              }
               
    }
    }
    public boolean isSymmetric(TreeNode root) {
        trav(root);
      return st.isEmpty();  
    }
}