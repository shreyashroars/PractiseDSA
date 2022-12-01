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
    int preIndex=0;
     TreeNode bstfromInorder(int[]pre,int[] in,int is,int ie)
     {
         if(is>ie)
             return null;
        
         TreeNode node=new TreeNode(pre[preIndex++]);
         int inIndex=0;
         for(int i=is;i<=ie;i++)
         {
             if(in[i]==node.val)
             {
                 inIndex=i;
                 break;
             }
         }
         node.left=bstfromInorder(pre,in,is,inIndex-1);
         node.right=bstfromInorder(pre,in,inIndex+1,ie);
         return node;
     }
    public TreeNode bstFromPreorder(int[] arr) {
        int in[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            in[i]=arr[i];
        Arrays.sort(in);
        return bstfromInorder(arr,in,0,arr.length-1);
    }

   
}