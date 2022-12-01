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
     int i = 0;
    public TreeNode bstFromPreorder(int[] arr) {
        return bstFromPreorder(arr, Integer.MAX_VALUE);
    }

    public TreeNode bstFromPreorder(int[] arr, int bound) {
        if (i == arr.length || arr[i] > bound) return null;
        TreeNode root = new TreeNode(arr[i++]);
        root.left = bstFromPreorder(arr, root.val);
        root.right = bstFromPreorder(arr, bound);
        return root;
    }
}