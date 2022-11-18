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
     String s="";
   List<String>arr=new ArrayList<>();
   
    public void inorder(TreeNode root,String s)
    {
        if(root.left==null && root.right==null)
        {
            s+=root.val;
            arr.add(s);
            return;
        }
        s+=root.val+"->";
        if(root.left!=null)
        inorder(root.left,s);
        //s+=" ";
           if(root.right!=null)
           {
               
               inorder(root.right,s);
              
           }
       
            
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        inorder(root,s);
       return arr;
    }
}
