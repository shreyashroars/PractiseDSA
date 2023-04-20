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
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode nextNode;
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
    public ListNode nodeAt(ListNode head,int k)
    {
        ListNode node1=head;
        ListNode temp=head;
        while(temp!=null)
        {
            k--;
            if(k==0)
            {
                node1=temp;
                break;
            }
            temp=temp.next;
                
        }
        return node1;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1=nodeAt(head,k);
        ListNode head2=rev(head);
        ListNode node2=nodeAt(head2,k);
        int y=node1.val;
        node1.val=node2.val;
        node2.val=y;
        return rev(head2);
        
    }
}