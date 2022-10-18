class StockSpanner {
    int i;
    ArrayDeque<Integer>s;
    int arr[];
    public StockSpanner() {
      arr=new int[100001];
     s=new ArrayDeque<>();
         i=0;
    }
    
    public int next(int price) {
        arr[i]=price;
        if(i==0)
        {
            s.push(i);
            i++;
            return 1;
        }
        while(s.isEmpty()==false && arr[s.peek()]<=price)
        {
            s.pop();
        }
        int span=s.isEmpty()?i+1:i-s.peek();
        s.push(i);
        i++;
        return span;
          
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */