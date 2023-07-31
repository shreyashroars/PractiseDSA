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
    ArrayList<TreeNode>arr=new ArrayList<>();
    ArrayList<TreeNode>ans=new ArrayList<>();
    int sum=0;
    public void printKNode(TreeNode root,int cnt,TreeNode blocker)
    {
        if(root==null||root==blocker)
            return;
        cnt++;
        sum=Math.max(sum,cnt);
        printKNode(root.left,cnt,blocker);
        printKNode(root.right,cnt,blocker);
    }
    public void preorder(TreeNode root,int start)
    {
        if(root==null)
            return;
        arr.add(root);
        if(root.val==start)
        {
            ans.addAll(arr);
        }
        preorder(root.left,start);
        preorder(root.right,start);
        arr.remove(arr.size()-1);
    }
    public int amountOfTime(TreeNode root, int start) {
        preorder(root,start);
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++)
        {
            printKNode(ans.get(i),i-1,i==0?null:ans.get(i-1));
        }
        return sum;
        
    }
}