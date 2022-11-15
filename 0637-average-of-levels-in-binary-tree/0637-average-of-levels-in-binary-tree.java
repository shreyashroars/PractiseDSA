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
    public List<Double> averageOfLevels(TreeNode root) {
       List<Double>arr=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            double s=0.0;
            double cnt=q.size();
            for(int i=0;i<cnt;i++)
            {
                TreeNode curr=q.poll();
                s+=curr.val;
                if(curr.left!=null)
                    q.offer(curr.left);
                 if(curr.right!=null)
                    q.offer(curr.right);
            }
            arr.add(s/cnt);
        }
        return arr;  
    }
}