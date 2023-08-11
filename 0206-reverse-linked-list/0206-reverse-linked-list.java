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
class Solution {
    ListNode prev=null;
    public void rev(ListNode curr)
    {
        if(curr==null)
            return;
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        rev(next);
    }
    public ListNode reverseList(ListNode head) {
        rev(head);
        return prev;
        
    }
}