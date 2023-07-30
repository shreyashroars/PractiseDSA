/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
     TreeNode lca;
    HashSet<TreeNode>arr=new HashSet<>();
    void trav1(TreeNode root,TreeNode n1)
    {
        
        if(root==n1)
        {
            if(arr.contains(root))
            lca=root;
            arr.add(root);
            return;
        }
        if(root.val<n1.val)
        {
            if(arr.contains(root))
                lca=root;
            else
            arr.add(root);
            trav1(root.right,n1);
        }
        else
        {
            if(arr.contains(root))
                lca=root;
           arr.add(root);
            trav1(root.left,n1); 
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca=root;
        trav1(root,p);
        trav1(root,q);
        return lca;
        
    }
}