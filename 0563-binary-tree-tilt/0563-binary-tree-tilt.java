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
   int sum=0,s=0; 
public int Tilt(TreeNode root)
{
    if(root==null)
          return 0;
    int left=Tilt(root.left);
    int right=Tilt(root.right);
        sum+= Math.abs(left-right);
         return left+right+root.val;
}
    
    public int findTilt(TreeNode root) {
      Tilt(root);
        return sum;
       
    }
}