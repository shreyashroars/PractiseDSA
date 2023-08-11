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
    public ListNode merge(ListNode head1,ListNode head2)
    {
        if(head1==null)
            return head2;
        else if(head2==null)
            return head1;
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        while(head1!=null && head2!=null)
        {
            if(head1.val<head2.val)
            {
                curr.next=head1;
                head1=head1.next;
            }
            else
            {
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        if(head1!=null)
            curr.next=head1;
        else
            curr.next=head2;
        return ans.next;
    }
    
    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!= null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null)
            return head;
        ListNode mid=middle(head);
        ListNode newHead=mid.next;
        mid.next=null;
        ListNode lh=sortList(head);
        ListNode rh=sortList(newHead);
        return merge(lh,rh);
        
    }
}