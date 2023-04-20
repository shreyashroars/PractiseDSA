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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        ListNode prev2=null,prev=head,curr=head.next,nextNode;
        while(curr!=null)
        {
            if(prev==head)
            {
                nextNode =curr.next;
                curr.next=prev;
                prev.next=nextNode;
                head=curr;
            }
            else
            {
                 nextNode =curr.next;
                curr.next=prev;
                prev.next=nextNode;
                prev2.next=curr;
                
            }
          //  prev2=curr;
            curr=nextNode;
            prev2=prev;
            prev=curr;
            if(curr!=null)
            curr=curr.next;
           
        }
        return head;
    }
}