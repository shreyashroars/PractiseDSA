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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode temp=head;
        int mid=0;
        while(temp!=null)
        {
            mid++;
            temp=temp.next;
        }
        mid=mid/2;
        temp=head;
        ListNode prev=null;
        while(mid>0)
        {
            prev=temp;
            temp=temp.next;
            mid--;
        }
        prev.next=temp.next;
        return head;
    }
}