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
    public ListNode reverseList(ListNode head)
    {
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode nextNode=null;
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            if(prev==head)
                prev.next=null;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
       ListNode  max=reverseList(head);
        ListNode pt=max;
        ListNode pt1=max;
        while(pt1!=null)
        {
            if(pt1.val>max.val)
            {
                max.next=pt1;
                max=pt1;
            }
            else if(pt1.val==max.val)
            {
                if(pt1!=max)
                {
                max.next=pt1;
                    max=pt1;
                }
            }
            pt1=pt1.next;
        }
        max.next=null;
        return reverseList(pt);
       
        
        
    }
}