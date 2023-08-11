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
    ListNode prev=null;
     int cnt=1;
    ListNode temp;
     ListNode next=null;
    public void rev(ListNode cur,int right,int left)
    {
        if(cnt==left)
            temp=cur;
        if(cnt==right+1)
            return;
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cnt++;
      //  System.out.println(cnt+" "+prev.val);
        rev(next,right,left);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr=head;
        ListNode st_prev=null;
        temp=head;
        while(cnt<left)
        {
            cnt=cnt+1;
            st_prev=curr;
            curr=curr.next;
            //if(cnt==left)
                
        }
        rev(curr,right,left);
        if(st_prev!=null)
        st_prev.next=prev;
        temp.next=next;
        if(left==1)
            head=prev;
        return head;
        
    }
}