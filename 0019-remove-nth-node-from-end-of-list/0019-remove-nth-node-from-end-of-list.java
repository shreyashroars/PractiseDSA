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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
         if(n==len)
            head=head.next;
        else
        {
        n=len-n-1;
       
        temp=head;
        while(n>0)
        {
            temp=temp.next;
            n--;
        }
        temp.next=temp.next.next;
        }
        return head;
        
    }
}