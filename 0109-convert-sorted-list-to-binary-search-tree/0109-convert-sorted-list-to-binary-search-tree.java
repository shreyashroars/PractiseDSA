/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode convToBST(ArrayList<Integer>arr,int l,int r)
    {
        if(l>r)
            return null;
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=convToBST(arr,l,mid-1);
        root.right=convToBST(arr,mid+1,r);
        return root;
        
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer>arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        return convToBST(arr,0,arr.size()-1);
        
    }
}