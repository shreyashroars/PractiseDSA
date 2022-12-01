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
    public static TreeNode sort(int[]arr,int left,int right)
    {
        if(left>right)
            return null;
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=sort(arr,left,mid-1);
        node.right=sort(arr,mid+1,right);
        return node;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
    return sort(nums,0,nums.length-1);
    }
}