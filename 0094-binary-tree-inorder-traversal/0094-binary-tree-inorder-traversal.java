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
    List<Integer>arr=new ArrayList<>();
    public void printinorder(TreeNode root)
    {
        if(root==null)
            return;
         printinorder(root.left);
         arr.add(root.val);
         printinorder(root.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        printinorder(root);
        return arr;
    }
}