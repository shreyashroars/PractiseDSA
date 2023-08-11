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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode temp1=head.next;
        ListNode temp=temp1;
        ListNode curr=head;
        ListNode curr_prev=null;
        while(curr!=null && curr.next!=null)
        {
            curr.next=curr.next.next;
            if(curr.next!=null)
                temp.next=curr.next.next;
            temp=temp.next;
            curr_prev=curr;
            curr=curr.next;
        }
        if(curr==null)
             curr_prev.next=temp1;  
        else
           curr.next=temp1;
        return head;
        
        
        
    }
}