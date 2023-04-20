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
    public ListNode rev(ListNode head)
    {
        ListNode curr=head.next,prev=head,nextNode;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head1= rev(l1);
       ListNode head2= rev(l2);
        ListNode temp1=head1,temp2=head2;
        ListNode start;
        while(temp1!=null && temp2!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp2==null)
        {
            temp1=head1;
            
            temp2=head2;
        }
        else
        {
            temp1=head2;
            
            temp2=head1;
        }
        int c=0;
        start=temp1;
        ListNode prev=null;
        while(temp1!=null)
        {
            if(temp2!=null)
                temp1.val=(temp1.val+temp2.val+c);
            else
                temp1.val=(temp1.val+c);
            c=temp1.val/10;
            temp1.val=temp1.val%10;
            prev=temp1;
            temp1=temp1.next;
            if(temp2!=null)
            temp2=temp2.next;
            
        }
        if(c!=0)
            prev.next=new ListNode(c);
        return rev(start);
        
        
        
        
    }
}