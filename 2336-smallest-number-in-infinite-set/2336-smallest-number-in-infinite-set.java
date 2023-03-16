class SmallestInfiniteSet {
    PriorityQueue<Integer>pq;
    HashSet<Integer>h;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
         h=new HashSet<>();
        for(int i=1;i<=1000;i++)
        {
            pq.add(i);
            h.add(i);
        }
    }
    
    public int popSmallest() {
        int y=pq.poll();
        h.remove(y);
        return y;
    }
    
    public void addBack(int num) {
       if(!h.contains(num)) 
       {
           pq.add(num);
           h.add(num);
    }
}
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */