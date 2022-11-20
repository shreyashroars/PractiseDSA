
class Solution {
   public boolean isSym(TreeNode node1,TreeNode node2)
   {
       if(node1==null && node2==null)
           return true;
       if(node1==null || node2==null)
           return false;
       if(node1.val!=node2.val)
           return false;
       return isSym(node1.left,node2.right) && isSym(node2.left,node1.right);
   }
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }
}