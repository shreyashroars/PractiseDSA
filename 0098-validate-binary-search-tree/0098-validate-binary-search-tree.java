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
    ArrayList<Integer>arr=new ArrayList<>();
    void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        HashSet<Integer>h=new HashSet<>();
        for(int x:arr)
            h.add(x);
        if(h.size()!=arr.size())
            return false;    
        int ar[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            ar[i]=arr.get(i);
        Arrays.sort(ar);
        for(int i=0;i<arr.size();i++)
        {
            if(ar[i]!=arr.get(i))
                return false;
        }
        return true;
    }
}