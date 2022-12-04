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
    int target;boolean c=false;
      HashSet<Integer>h=new HashSet<>();
    public void preorder(TreeNode root)
    {
        if(root==null)
            return;
        if(h.contains(target-root.val))
        {
            c=true;
            return;
        }
        h.add(root.val);
         preorder(root.left);
        preorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
      target=k;
        preorder(root);
        return c;
    }
}