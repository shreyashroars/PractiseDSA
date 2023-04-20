class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val=val;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        ListNode head=null,temp=head;
        for(int x:nums)
        {
            if(head==null)
            {
                head=new ListNode(x);
                temp=head;
            }
            else
            {
                temp.next=new ListNode(x);
                temp=temp.next;
            }
        }
         temp=head;
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
        int i=0;
       while(head!=null)
       {
           nums[i++]=head.val;
           head=head.next;
       }
        
    }
    
}