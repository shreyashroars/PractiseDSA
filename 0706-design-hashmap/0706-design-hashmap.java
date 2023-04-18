class ListNode
{
    int key;
    int val;
    ListNode next;

ListNode(int key,int val)
{
    this.key=key;
    this.val=val;
}
}

class MyHashMap {
     ListNode head;

    public MyHashMap() {
        head=null;
        
    }
    
    public void put(int key, int value) {
        ListNode node=new ListNode(key,value);
        if(head==null)
            head=node;
        else
        {
            ListNode temp=head;
            while(temp.next!=null)
            {
                if(temp.key==key)
                {
                    temp.val=value;
                    return;
                }
                temp=temp.next;
            }
            if(temp.key==key)
                temp.val=value;
            else
                temp.next=node;
        }
        
        
        
    }
    
    public int get(int key) {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.key==key)
                return temp.val;
            temp=temp.next;
        }
        return -1;
        
        
    }
    
    public void remove(int key) {
        if(head==null)
            return ;
        if(head.key==key)
        {
            head=head.next;
            return;
        }
         ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null)
        {
            if(temp.key==key)
            {
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */