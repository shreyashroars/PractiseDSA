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

//First convert to sorted array and then do sorted array to BST conversion
class Solution {
    List<TreeNode>arr=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null)
            return ;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }
    public TreeNode toBST(int start,int end)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=arr.get(mid);
        root.left=toBST(start,mid-1);
        root.right=toBST(mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return toBST(0,arr.size()-1);
    }
}