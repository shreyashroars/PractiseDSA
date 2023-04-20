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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        k=k%n;
        n=n-k;
        temp=head;
        while(n>1)
        {
            temp=temp.next;
            n--;
        }
        ListNode last=temp;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=head;
        head=temp.next;
        temp.next=null;
        return head;
        
    }
}