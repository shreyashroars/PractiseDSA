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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[]=new ListNode[k];
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        int j=0;
        int modulo=len%k;
        int numOfEle=len/k;
        temp=head;
        while(temp!=null)
        { 
            for(int i=1;i<numOfEle;i++)
            {
                temp=temp.next;
            }
            if(modulo>0 && numOfEle>0)
                temp=temp.next;
            ListNode nextNode=temp.next; 
            temp.next=null;
            arr[j++]=head;
            if(modulo>=1)
            modulo--;
            temp=nextNode;
            head=temp;
            
        }
        return arr;
        
    }
}