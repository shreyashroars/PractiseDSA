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
     int d=0;
    ListNode prev=null;
    public void rev(ListNode curr)
    {
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null)
        {
            temp=temp.next;
            cnt++;  
        }
        temp=head;
       d=cnt/2;
        ListNode st_prev=null;
        while(d>0)
        {
            st_prev=temp;
            temp=temp.next;
            d--;
        }
        rev(temp);
        st_prev.next=prev;
      //  System.out.println(prev.val);
        d=cnt/2;
        while(d>0)
        {
            if(head.val==prev.val)
            {
               // System.out.println(head.val+" "+prev.val);
                head=head.next;
                prev=prev.next;
            }
            else
                return false;
            d--;
        }
        return true;
        
        
        
    }
}