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
    HashMap<String,Integer>h=new HashMap<>();
    List<TreeNode>arr=new ArrayList<>();
    public String getSubtreeString(TreeNode root)
    {
     if(root==null)
            return "#";
        String s=root.val+","+getSubtreeString(root.left)+","+getSubtreeString(root.right);
         h.put(s,h.getOrDefault(s,0)+1); 
        if(h.get(s)==2)
            arr.add(root);
         
        return s;
        }
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        getSubtreeString(root);
        // for(Map.Entry<String,Integer>e:h.entrySet())
        // {
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }
        return arr;
       
        
    }
}