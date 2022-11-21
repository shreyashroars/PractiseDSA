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
    TreeNode maxtree(int[] nums,int start,int end)
    {
       if(start>end)
           return null;
        int br_ind=getmax(nums,start,end);
        TreeNode root=new TreeNode(nums[br_ind]);
        root.left=maxtree(nums,start,br_ind-1);
        root.right=maxtree(nums,br_ind+1,end);
        return root;
    }
    public int getmax(int nums[],int start,int end)
    {
      int max=start;
        for(int i=start;i<=end;i++)
        {
           if(nums[max]<nums[i])
               max=i;
        }
        return max;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return maxtree(nums,0,nums.length-1);    
    }
}