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
class BSTIterator {
Stack<TreeNode>st;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        stack_update(root);
    }
    
    public int next() {
       TreeNode t=st.pop();
        stack_update(t.right);
        return t.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void stack_update(TreeNode node)
    {
        while(node!=null)
        {
            st.add(node);
            node=node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */