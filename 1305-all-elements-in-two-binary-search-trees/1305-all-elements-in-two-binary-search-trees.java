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
   
    List<Integer>arr1=new ArrayList<>();
    List<Integer>arr2=new ArrayList<>();
   List<Integer>arr=new ArrayList<>();
    public void inorder(TreeNode root)
    {
       if(root==null)
           return;
        inorder(root.left);
        arr1.add(root.val);
        inorder(root.right);
    }
     public void inorder1(TreeNode root)
    {
       if(root==null)
           return;
        inorder1(root.left);
      arr2.add(root.val);
        inorder1(root.right);
    }
    
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     inorder(root1);
     inorder1(root2);
        
        int i=0,j=0;
        
        int n=arr1.size(),m=arr2.size();

        while(i<n &&j<m)
        {
            if(arr1.get(i)<arr2.get(j))
            {
                arr.add(arr1.get(i));
                i++;
            }
            else 
            {
                arr.add(arr2.get(j));
                j++;
            }
          
        }
          while(i<n)
            {
               arr.add(arr1.get(i));
                i++;
            }
            while(j<m)
            {
                arr.add(arr2.get(j));
                j++;
            }
        return arr;
    }
}