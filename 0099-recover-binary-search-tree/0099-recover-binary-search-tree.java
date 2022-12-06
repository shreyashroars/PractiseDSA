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
      int x=0,y=0;
    ArrayList<Integer>arr=new ArrayList<>();
    void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    void inorder1(TreeNode root)
    {
        if(root==null)
        return ;
        inorder1(root.left);
        if(root.val==x)
        root.val=y;
        else if(root.val==y)
        root.val=x;
        inorder1(root.right);
    }
    public void recoverTree(TreeNode root) {
      inorder(root);  
     int ar[]=new int[arr.size()];
     for(int i=0;i<arr.size();i++)
     ar[i]=arr.get(i);
     Arrays.sort(ar);
   
     for(int i=0;i<arr.size();i++)
     {
         if(arr.get(i)!=ar[i])
         {
          x=arr.get(i);
          y=ar[i];
          break;
         }
     }
     inorder1(root);
    }
}