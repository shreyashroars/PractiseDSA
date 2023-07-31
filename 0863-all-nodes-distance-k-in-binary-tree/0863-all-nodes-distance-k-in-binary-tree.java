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
    static List<TreeNode>ans=new ArrayList<>();
    static List<TreeNode>arr=new ArrayList<>();
    static List<Integer>arr1=new ArrayList<>();
    public static void print_Node_At_K(TreeNode root,int k,TreeNode blocker)
    {
        if(root==null||k<0||root==blocker)
        return ;
        if(k==0)
        arr1.add(root.val);
        print_Node_At_K(root.left,k-1,blocker);
        print_Node_At_K(root.right,k-1,blocker);
        
    }
    public static void preorder(TreeNode root,TreeNode x,List<TreeNode>arr)
    {
        if(root==null)
        return;
        arr.add(root);
        if(root.val==x.val)
            ans.addAll(arr);
        preorder(root.left,x,arr);
        preorder(root.right,x,arr);
        arr.remove(arr.size()-1);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer>temp=new ArrayList<>();
        preorder(root,target,arr);
        Collections.reverse(ans);
    for(int i=0;i<ans.size();i++)
	{
	    print_Node_At_K(ans.get(i),k-i,i==0?null:ans.get(i-1));
	}
	 Collections.sort(arr1);
	 temp.addAll(arr1);
	 arr.clear();
	 arr1.clear();
	 ans.clear();
	 return temp;
        
    }
}