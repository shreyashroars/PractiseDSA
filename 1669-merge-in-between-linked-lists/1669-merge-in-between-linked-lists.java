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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2_end=list2;
        while(list2_end.next!=null)
        {
            list2_end=list2_end.next;
        }
        ListNode st=list1;
        ListNode curr=list1;
        int cnt=0;
        while(cnt!=b)
        {
            if(cnt+1==a)
                st=curr;
                
            curr=curr.next;
            cnt++;
            
        }
        st.next=list2;
        list2_end.next=curr.next;
        return list1;
    }
}