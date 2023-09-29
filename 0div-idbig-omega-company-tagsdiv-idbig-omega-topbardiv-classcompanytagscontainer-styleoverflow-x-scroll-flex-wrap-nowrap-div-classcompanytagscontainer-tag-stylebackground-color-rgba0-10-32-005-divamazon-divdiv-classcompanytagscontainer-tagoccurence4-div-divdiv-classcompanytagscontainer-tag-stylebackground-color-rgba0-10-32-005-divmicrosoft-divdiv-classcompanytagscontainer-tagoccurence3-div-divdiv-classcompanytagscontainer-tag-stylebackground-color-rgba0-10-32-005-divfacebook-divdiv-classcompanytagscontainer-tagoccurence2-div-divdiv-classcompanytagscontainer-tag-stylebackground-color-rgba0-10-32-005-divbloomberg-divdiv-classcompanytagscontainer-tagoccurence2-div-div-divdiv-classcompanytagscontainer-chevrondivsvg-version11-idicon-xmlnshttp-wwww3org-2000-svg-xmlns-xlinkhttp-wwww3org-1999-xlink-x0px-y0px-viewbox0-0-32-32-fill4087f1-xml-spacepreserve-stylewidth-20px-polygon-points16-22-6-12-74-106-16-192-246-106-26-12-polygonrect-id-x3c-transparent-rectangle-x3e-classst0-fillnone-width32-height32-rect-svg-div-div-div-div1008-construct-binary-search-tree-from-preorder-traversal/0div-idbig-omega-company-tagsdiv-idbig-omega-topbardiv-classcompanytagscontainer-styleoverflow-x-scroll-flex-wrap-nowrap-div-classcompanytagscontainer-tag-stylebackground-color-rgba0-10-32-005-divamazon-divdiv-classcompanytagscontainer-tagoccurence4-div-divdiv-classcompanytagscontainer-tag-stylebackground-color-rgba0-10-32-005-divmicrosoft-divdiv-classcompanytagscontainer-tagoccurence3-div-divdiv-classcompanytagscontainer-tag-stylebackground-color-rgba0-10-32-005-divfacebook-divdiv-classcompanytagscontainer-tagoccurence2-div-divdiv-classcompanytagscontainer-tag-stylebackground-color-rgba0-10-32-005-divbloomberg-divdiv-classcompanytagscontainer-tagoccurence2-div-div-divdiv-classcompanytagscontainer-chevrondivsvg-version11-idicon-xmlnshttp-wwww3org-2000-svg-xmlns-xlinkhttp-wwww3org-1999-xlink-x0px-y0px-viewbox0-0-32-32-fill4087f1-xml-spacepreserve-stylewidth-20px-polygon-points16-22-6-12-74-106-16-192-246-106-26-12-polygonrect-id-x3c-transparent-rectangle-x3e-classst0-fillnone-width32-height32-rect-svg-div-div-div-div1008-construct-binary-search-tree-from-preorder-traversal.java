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

// [8,5,1,7,10,12]
class Solution {
    int i=0;
    public TreeNode formBST(int[]arr,int upperBound)
    {
        if(i==arr.length || arr[i]>upperBound)
            return null;
        TreeNode node=new TreeNode(arr[i++]);
        node.left=formBST(arr,node.val);
        node.right=formBST(arr,upperBound);
        return node;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        return formBST(preorder,Integer.MAX_VALUE);
        
        
    }
}