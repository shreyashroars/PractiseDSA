/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        int f=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
               f=1; 
               break;
            }
        }
        if(f==1)
        {
            slow=head;
            while(slow!=fast)
            {
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
        return null;
        
       
        
    }
}