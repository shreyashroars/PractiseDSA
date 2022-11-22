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
    TreeMap<Integer,Integer>t=new TreeMap<>();
    List<Integer>arr=new ArrayList<>();
    
    public void inorder(TreeNode root)
    {
       if(root==null)
           return;
        inorder(root.left);
        t.put(root.val,t.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     inorder(root1);
     inorder(root2);
    for(Map.Entry<Integer,Integer> entry : t.entrySet())
    {
         while(entry.getValue()>0)
         {
             arr.add(entry.getKey());
             t.put(entry.getKey(),t.getOrDefault(entry.getKey(),0)-1);
         }
    }
        return arr;
    }
}