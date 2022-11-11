class MyCircularDeque {
  int cap;
    ArrayDeque<Integer>q=new ArrayDeque<>();
    public MyCircularDeque(int k) {
       cap=k; 
    }
    
    public boolean insertFront(int value) {
        if(q.size()==cap)
            return false;
        q.offerFirst(value);
        return true;
    }
    
    public boolean insertLast(int value) {
      if(q.size()==cap)
            return false;  
      q.offerLast(value);
        return true;
    }
    
    public boolean deleteFront() {
      if(q.size()==0)
          return false;
        q.pollFirst();
        return true;
    }
    
    public boolean deleteLast() {
       if(q.size()==0)
          return false;
        q.pollLast();
        return true;
    }
    
    public int getFront() {
        return  q.size()==0?-1:q.peekFirst();
    }
    
    public int getRear() {
       return  q.size()==0?-1:q.peekLast(); 
    }
    
    public boolean isEmpty() {
      return q.isEmpty();  
    }
    
    public boolean isFull() {
       return q.size()==cap; 
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */