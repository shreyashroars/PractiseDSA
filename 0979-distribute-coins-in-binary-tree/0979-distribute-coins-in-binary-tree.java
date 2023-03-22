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
    int moves=0;
    public int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        int coinsLeft=helper(root.left);
        int coinsRight=helper(root.right);
        int coins=coinsLeft+coinsRight;
        coins+=root.val-1;
        moves+=Math.abs(coins);
        return coins;
    }
    public int distributeCoins(TreeNode root) {
        
       helper(root);
        return moves;
    }
}