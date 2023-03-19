class BrowserHistory {
    class ListNode
    {
        String data;
        ListNode left;
        ListNode right;
        ListNode(String d)
        {
            data=d;
        }
    }
    ListNode head;
    public BrowserHistory(String homepage) {
        head =new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode newNode=new ListNode(url);
        head.right=newNode;
        newNode.left=head;
        head=newNode;   
    }
    
    public String back(int steps) {
        while(steps>0 && head.left!=null)
        {
            head=head.left;
            steps--;
        }
        return head.data;
        
    }
    
    public String forward(int steps) {
         while(steps>0 && head.right!=null)
        {
            head=head.right;
            steps--;
        }
        return head.data;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */