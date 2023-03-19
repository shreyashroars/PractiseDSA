/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
            return null;
        Node temp;
     while(head.next!=null ||head.child!=null)
     {
         if(head.child==null)
             head=head.next;
         else
         {
             temp=head.next;
             head.next=head.child;
             head.next.prev=head;
             head.child=temp;
             head=head.next;
             }
     }
        temp=head;
        while(head.prev!=null||head.child!=null)
        {
           if(head.child!=null)
           {
               Node t=head;
               temp.next=t.child;
               temp.next.prev=temp;
               t.child=null;
               while(temp.next!=null)
                   temp=temp.next;
           }
            if(head.prev==null)
                return head;
            head=head.prev;
        }
        return head;
        
    }
}