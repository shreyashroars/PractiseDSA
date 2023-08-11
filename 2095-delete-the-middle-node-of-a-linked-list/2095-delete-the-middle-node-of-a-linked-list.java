class Solution {
    public ListNode deleteMiddle(ListNode head) {
       ListNode fast=head,slow=head;
        if(head.next==null)
            return null;
        if(head.next.next==null)
        {
            head.next=null;
             return head;
        }
       
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        if(slow.next!=null)
        {
        slow.val=slow.next.val;
        slow.next=slow.next.next;
        }
       
        return head;
        
    }
}