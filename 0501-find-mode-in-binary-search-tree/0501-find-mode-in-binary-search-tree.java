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
    Integer prev=null;
    int count=1,max=0;
    public void inorder(TreeNode root,List<Integer>modes)
    {
        if(root==null)
            return ;
        inorder(root.left,modes);
        if(prev!=null)
        {
            if(prev==root.val)
                count++;
            else
                count=1;
        }
        if(count>max)
        {
            max=count;
            modes.clear();
            modes.add(root.val);
        }
        else if(count==max)
            modes.add(root.val);
        prev=root.val;
        inorder(root.right,modes);
        
    }
    public int[] findMode(TreeNode root) {
        List<Integer>modes=new ArrayList<>();
        inorder(root,modes);
        int arr[]=new int[modes.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=modes.get(i);
        return arr;
    }
}