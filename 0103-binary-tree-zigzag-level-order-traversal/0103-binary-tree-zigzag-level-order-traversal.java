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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>arr1=new ArrayList<>();
        if(root==null)
            return arr1;
      Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int k=0;
        while(!q.isEmpty())
        {
            List<Integer>arr=new ArrayList<>();
            Stack<Integer>st=new Stack<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                if(k%2==0)
                    arr.add(node.val);
                else
                    st.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            if(k%2!=0)
            {
                while(!st.isEmpty())
                {
                    arr.add(st.pop());
                }
            }
            arr1.add(arr);
            
            k++;
        }
        return arr1;
        
    }
}