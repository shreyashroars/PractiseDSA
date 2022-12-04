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
    int s=0;
    Stack<Integer>arr=new Stack<>();
    public void inorderkaulta(TreeNode root)
    {
       if(root==null)
           return;
        inorderkaulta(root.right);
        s+=root.val;
        arr.push(s);
        inorderkaulta(root.left);
    }
   public void  inorder(TreeNode root)
   {
       if(root==null)
           return;
       inorder(root.left);
       root.val=arr.pop();
       inorder(root.right);
       
   }
    public TreeNode bstToGst(TreeNode root) {
    inorderkaulta(root);
        inorder(root);
        return root;
    }
}