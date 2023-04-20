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
        if( head==null||head.next==null)
            return head;
        ListNode ptr1=head,ptr2=head.next,ptr3=null,ptr4=ptr2;
        while(ptr1!=null)
        {
            if(ptr1.next==null)
                ptr1.next=null;
            else
            {
                if(ptr1!=head)
                {
                    ptr2.next=ptr1.next;
                    ptr2=ptr2.next;
                }
                ptr1.next=ptr1.next.next;
            }
            ptr3=ptr1;
            ptr1=ptr1.next;
        }
        ptr2.next=null;
        ptr3.next=ptr4;
        return head;
        
    }
}